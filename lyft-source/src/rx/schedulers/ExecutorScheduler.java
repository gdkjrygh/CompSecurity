// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.schedulers;

import java.util.concurrent.Executor;
import rx.Scheduler;

final class ExecutorScheduler extends Scheduler
{

    final Executor executor;

    public ExecutorScheduler(Executor executor1)
    {
        executor = executor1;
    }

    public rx.Scheduler.Worker createWorker()
    {
        return new ExecutorSchedulerWorker(executor);
    }

    private class ExecutorSchedulerWorker extends rx.Scheduler.Worker
        implements Runnable
    {

        final Executor executor;
        final ConcurrentLinkedQueue queue = new ConcurrentLinkedQueue();
        final CompositeSubscription tasks = new CompositeSubscription();
        final AtomicInteger wip = new AtomicInteger();

        public boolean isUnsubscribed()
        {
            return tasks.isUnsubscribed();
        }

        public void run()
        {
            do
            {
                ScheduledAction scheduledaction = (ScheduledAction)queue.poll();
                if (!scheduledaction.isUnsubscribed())
                {
                    scheduledaction.run();
                }
            } while (wip.decrementAndGet() > 0);
        }

        public Subscription schedule(Action0 action0)
        {
            if (isUnsubscribed())
            {
                action0 = Subscriptions.unsubscribed();
            } else
            {
                ScheduledAction scheduledaction = new ScheduledAction(action0, tasks);
                tasks.add(scheduledaction);
                queue.offer(scheduledaction);
                action0 = scheduledaction;
                if (wip.getAndIncrement() == 0)
                {
                    try
                    {
                        executor.execute(this);
                    }
                    // Misplaced declaration of an exception variable
                    catch (Action0 action0)
                    {
                        tasks.remove(scheduledaction);
                        wip.decrementAndGet();
                        RxJavaPlugins.getInstance().getErrorHandler().handleError(action0);
                        throw action0;
                    }
                    return scheduledaction;
                }
            }
            return action0;
        }

        public Subscription schedule(final Action0 action, long l, TimeUnit timeunit)
        {
            if (l <= 0L)
            {
                return schedule(action);
            }
            if (isUnsubscribed())
            {
                return Subscriptions.unsubscribed();
            }
            ScheduledExecutorService scheduledexecutorservice;
            MultipleAssignmentSubscription multipleassignmentsubscription;
            final Subscription removeMas;
            final MultipleAssignmentSubscription mas;
            if (executor instanceof ScheduledExecutorService)
            {
                scheduledexecutorservice = (ScheduledExecutorService)executor;
            } else
            {
                scheduledexecutorservice = GenericScheduledExecutorService.getInstance();
            }
            multipleassignmentsubscription = new MultipleAssignmentSubscription();
            mas = new MultipleAssignmentSubscription();
            mas.set(multipleassignmentsubscription);
            tasks.add(mas);
            removeMas = Subscriptions.create(new Action0() {

                final ExecutorSchedulerWorker this$0;
                final MultipleAssignmentSubscription val$mas;

                public void call()
                {
                    tasks.remove(mas);
                }

                
                {
                    this$0 = ExecutorSchedulerWorker.this;
                    mas = multipleassignmentsubscription;
                    super();
                }
            });
            action = new ScheduledAction(new Action0() {

                final ExecutorSchedulerWorker this$0;
                final Action0 val$action;
                final MultipleAssignmentSubscription val$mas;
                final Subscription val$removeMas;

                public void call()
                {
                    if (!mas.isUnsubscribed())
                    {
                        Subscription subscription = schedule(action);
                        mas.set(subscription);
                        if (subscription.getClass() == rx/internal/schedulers/ScheduledAction)
                        {
                            ((ScheduledAction)subscription).add(removeMas);
                            return;
                        }
                    }
                }

                
                {
                    this$0 = ExecutorSchedulerWorker.this;
                    mas = multipleassignmentsubscription;
                    action = action0;
                    removeMas = subscription;
                    super();
                }
            });
            multipleassignmentsubscription.set(action);
            try
            {
                action.add(scheduledexecutorservice.schedule(action, l, timeunit));
            }
            // Misplaced declaration of an exception variable
            catch (final Action0 action)
            {
                RxJavaPlugins.getInstance().getErrorHandler().handleError(action);
                throw action;
            }
            return removeMas;
        }

        public void unsubscribe()
        {
            tasks.unsubscribe();
        }

        public ExecutorSchedulerWorker(Executor executor1)
        {
            executor = executor1;
        }
    }

}
