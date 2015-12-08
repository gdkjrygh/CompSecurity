.class public Lroboguice/event/eventListener/AsynchronousEventListenerDecorator;
.super Ljava/lang/Object;
.source "AsynchronousEventListenerDecorator.java"

# interfaces
.implements Lroboguice/event/EventListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lroboguice/event/EventListener",
        "<TT;>;"
    }
.end annotation


# instance fields
.field protected eventListener:Lroboguice/event/EventListener;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lroboguice/event/EventListener",
            "<TT;>;"
        }
    .end annotation
.end field

.field protected handler:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/os/Handler;Lroboguice/event/EventListener;)V
    .locals 0
    .param p1, "handler"    # Landroid/os/Handler;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/Handler;",
            "Lroboguice/event/EventListener",
            "<TT;>;)V"
        }
    .end annotation

    .prologue
    .line 21
    .local p0, "this":Lroboguice/event/eventListener/AsynchronousEventListenerDecorator;, "Lroboguice/event/eventListener/AsynchronousEventListenerDecorator<TT;>;"
    .local p2, "eventListener":Lroboguice/event/EventListener;, "Lroboguice/event/EventListener<TT;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lroboguice/event/eventListener/AsynchronousEventListenerDecorator;->handler:Landroid/os/Handler;

    .line 23
    iput-object p2, p0, Lroboguice/event/eventListener/AsynchronousEventListenerDecorator;->eventListener:Lroboguice/event/EventListener;

    .line 24
    return-void
.end method

.method public constructor <init>(Lroboguice/event/EventListener;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lroboguice/event/EventListener",
            "<TT;>;)V"
        }
    .end annotation

    .prologue
    .line 17
    .local p0, "this":Lroboguice/event/eventListener/AsynchronousEventListenerDecorator;, "Lroboguice/event/eventListener/AsynchronousEventListenerDecorator<TT;>;"
    .local p1, "eventListener":Lroboguice/event/EventListener;, "Lroboguice/event/EventListener<TT;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Lroboguice/event/eventListener/AsynchronousEventListenerDecorator;->eventListener:Lroboguice/event/EventListener;

    .line 19
    return-void
.end method


# virtual methods
.method public onEvent(Ljava/lang/Object;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .prologue
    .line 27
    .local p0, "this":Lroboguice/event/eventListener/AsynchronousEventListenerDecorator;, "Lroboguice/event/eventListener/AsynchronousEventListenerDecorator<TT;>;"
    .local p1, "event":Ljava/lang/Object;, "TT;"
    new-instance v0, Lroboguice/event/eventListener/RunnableAsyncTaskAdaptor;

    iget-object v1, p0, Lroboguice/event/eventListener/AsynchronousEventListenerDecorator;->handler:Landroid/os/Handler;

    new-instance v2, Lroboguice/event/eventListener/EventListenerRunnable;

    iget-object v3, p0, Lroboguice/event/eventListener/AsynchronousEventListenerDecorator;->eventListener:Lroboguice/event/EventListener;

    invoke-direct {v2, p1, v3}, Lroboguice/event/eventListener/EventListenerRunnable;-><init>(Ljava/lang/Object;Lroboguice/event/EventListener;)V

    invoke-direct {v0, v1, v2}, Lroboguice/event/eventListener/RunnableAsyncTaskAdaptor;-><init>(Landroid/os/Handler;Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Lroboguice/event/eventListener/RunnableAsyncTaskAdaptor;->execute()V

    .line 28
    return-void
.end method
