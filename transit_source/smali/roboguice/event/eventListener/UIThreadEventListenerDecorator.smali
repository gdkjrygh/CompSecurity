.class public Lroboguice/event/eventListener/UIThreadEventListenerDecorator;
.super Ljava/lang/Object;
.source "UIThreadEventListenerDecorator.java"

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
.method public constructor <init>(Lroboguice/event/EventListener;Landroid/os/Handler;)V
    .locals 0
    .param p2, "handler"    # Landroid/os/Handler;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lroboguice/event/EventListener",
            "<TT;>;",
            "Landroid/os/Handler;",
            ")V"
        }
    .end annotation

    .prologue
    .line 17
    .local p0, "this":Lroboguice/event/eventListener/UIThreadEventListenerDecorator;, "Lroboguice/event/eventListener/UIThreadEventListenerDecorator<TT;>;"
    .local p1, "eventListener":Lroboguice/event/EventListener;, "Lroboguice/event/EventListener<TT;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Lroboguice/event/eventListener/UIThreadEventListenerDecorator;->eventListener:Lroboguice/event/EventListener;

    .line 19
    iput-object p2, p0, Lroboguice/event/eventListener/UIThreadEventListenerDecorator;->handler:Landroid/os/Handler;

    .line 20
    return-void
.end method


# virtual methods
.method public onEvent(Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .prologue
    .line 23
    .local p0, "this":Lroboguice/event/eventListener/UIThreadEventListenerDecorator;, "Lroboguice/event/eventListener/UIThreadEventListenerDecorator<TT;>;"
    .local p1, "event":Ljava/lang/Object;, "TT;"
    iget-object v0, p0, Lroboguice/event/eventListener/UIThreadEventListenerDecorator;->handler:Landroid/os/Handler;

    new-instance v1, Lroboguice/event/eventListener/EventListenerRunnable;

    iget-object v2, p0, Lroboguice/event/eventListener/UIThreadEventListenerDecorator;->eventListener:Lroboguice/event/EventListener;

    invoke-direct {v1, p1, v2}, Lroboguice/event/eventListener/EventListenerRunnable;-><init>(Ljava/lang/Object;Lroboguice/event/EventListener;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 24
    return-void
.end method
