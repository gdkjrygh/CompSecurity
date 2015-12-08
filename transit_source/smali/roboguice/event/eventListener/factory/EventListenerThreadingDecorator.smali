.class public Lroboguice/event/eventListener/factory/EventListenerThreadingDecorator;
.super Ljava/lang/Object;
.source "EventListenerThreadingDecorator.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lroboguice/event/eventListener/factory/EventListenerThreadingDecorator$1;
    }
.end annotation


# instance fields
.field protected handlerProvider:Lcom/google/inject/Provider;
    .annotation runtime Lcom/google/inject/Inject;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/inject/Provider",
            "<",
            "Landroid/os/Handler;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    return-void
.end method


# virtual methods
.method public decorate(Lroboguice/event/EventThread;Lroboguice/event/EventListener;)Lroboguice/event/EventListener;
    .locals 2
    .param p1, "threadType"    # Lroboguice/event/EventThread;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lroboguice/event/EventThread;",
            "Lroboguice/event/EventListener",
            "<TT;>;)",
            "Lroboguice/event/EventListener",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 21
    .local p2, "eventListener":Lroboguice/event/EventListener;, "Lroboguice/event/EventListener<TT;>;"
    sget-object v0, Lroboguice/event/eventListener/factory/EventListenerThreadingDecorator$1;->$SwitchMap$roboguice$event$EventThread:[I

    invoke-virtual {p1}, Lroboguice/event/EventThread;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 27
    .end local p2    # "eventListener":Lroboguice/event/EventListener;, "Lroboguice/event/EventListener<TT;>;"
    :goto_0
    return-object p2

    .line 23
    .restart local p2    # "eventListener":Lroboguice/event/EventListener;, "Lroboguice/event/EventListener<TT;>;"
    :pswitch_0
    new-instance v1, Lroboguice/event/eventListener/UIThreadEventListenerDecorator;

    iget-object v0, p0, Lroboguice/event/eventListener/factory/EventListenerThreadingDecorator;->handlerProvider:Lcom/google/inject/Provider;

    invoke-interface {v0}, Lcom/google/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    invoke-direct {v1, p2, v0}, Lroboguice/event/eventListener/UIThreadEventListenerDecorator;-><init>(Lroboguice/event/EventListener;Landroid/os/Handler;)V

    move-object p2, v1

    goto :goto_0

    .line 25
    :pswitch_1
    new-instance v0, Lroboguice/event/eventListener/AsynchronousEventListenerDecorator;

    invoke-direct {v0, p2}, Lroboguice/event/eventListener/AsynchronousEventListenerDecorator;-><init>(Lroboguice/event/EventListener;)V

    move-object p2, v0

    goto :goto_0

    .line 21
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
