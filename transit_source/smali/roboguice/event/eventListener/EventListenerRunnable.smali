.class public Lroboguice/event/eventListener/EventListenerRunnable;
.super Ljava/lang/Object;
.source "EventListenerRunnable.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/lang/Runnable;"
    }
.end annotation


# instance fields
.field protected event:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field protected eventListener:Lroboguice/event/EventListener;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lroboguice/event/EventListener",
            "<TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lroboguice/event/EventListener;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lroboguice/event/EventListener",
            "<TT;>;)V"
        }
    .end annotation

    .prologue
    .line 15
    .local p0, "this":Lroboguice/event/eventListener/EventListenerRunnable;, "Lroboguice/event/eventListener/EventListenerRunnable<TT;>;"
    .local p1, "event":Ljava/lang/Object;, "TT;"
    .local p2, "eventListener":Lroboguice/event/EventListener;, "Lroboguice/event/EventListener<TT;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lroboguice/event/eventListener/EventListenerRunnable;->event:Ljava/lang/Object;

    .line 17
    iput-object p2, p0, Lroboguice/event/eventListener/EventListenerRunnable;->eventListener:Lroboguice/event/EventListener;

    .line 18
    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 21
    .local p0, "this":Lroboguice/event/eventListener/EventListenerRunnable;, "Lroboguice/event/eventListener/EventListenerRunnable<TT;>;"
    iget-object v0, p0, Lroboguice/event/eventListener/EventListenerRunnable;->eventListener:Lroboguice/event/EventListener;

    iget-object v1, p0, Lroboguice/event/eventListener/EventListenerRunnable;->event:Ljava/lang/Object;

    invoke-interface {v0, v1}, Lroboguice/event/EventListener;->onEvent(Ljava/lang/Object;)V

    .line 22
    return-void
.end method
