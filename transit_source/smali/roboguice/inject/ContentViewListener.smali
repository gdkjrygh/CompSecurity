.class public Lroboguice/inject/ContentViewListener;
.super Ljava/lang/Object;
.source "ContentViewListener.java"


# annotations
.annotation runtime Lroboguice/inject/ContextSingleton;
.end annotation


# instance fields
.field protected activity:Landroid/app/Activity;
    .annotation runtime Lcom/google/inject/Inject;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public optionallySetContentView(Lroboguice/activity/event/OnCreateEvent;)V
    .locals 4
    .param p1, "ignored"    # Lroboguice/activity/event/OnCreateEvent;
        .annotation runtime Lroboguice/event/Observes;
        .end annotation
    .end param

    .prologue
    .line 17
    iget-object v2, p0, Lroboguice/inject/ContentViewListener;->activity:Landroid/app/Activity;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    .line 18
    .local v1, "c":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    :goto_0
    const-class v2, Landroid/content/Context;

    if-eq v1, v2, :cond_0

    .line 19
    const-class v2, Lroboguice/inject/ContentView;

    invoke-virtual {v1, v2}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v0

    check-cast v0, Lroboguice/inject/ContentView;

    .line 20
    .local v0, "annotation":Lroboguice/inject/ContentView;
    if-eqz v0, :cond_1

    .line 21
    iget-object v2, p0, Lroboguice/inject/ContentViewListener;->activity:Landroid/app/Activity;

    invoke-interface {v0}, Lroboguice/inject/ContentView;->value()I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/app/Activity;->setContentView(I)V

    .line 26
    .end local v0    # "annotation":Lroboguice/inject/ContentView;
    :cond_0
    return-void

    .line 24
    .restart local v0    # "annotation":Lroboguice/inject/ContentView;
    :cond_1
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v1

    .line 25
    goto :goto_0
.end method
