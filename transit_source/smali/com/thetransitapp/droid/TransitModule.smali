.class public Lcom/thetransitapp/droid/TransitModule;
.super Ljava/lang/Object;
.source "TransitModule.java"

# interfaces
.implements Lcom/google/inject/Module;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public configure(Lcom/google/inject/Binder;)V
    .locals 2
    .param p1, "binder"    # Lcom/google/inject/Binder;

    .prologue
    .line 12
    const-class v0, Lcom/thetransitapp/droid/data/TransitSource;

    invoke-interface {p1, v0}, Lcom/google/inject/Binder;->bind(Ljava/lang/Class;)Lcom/google/inject/binder/AnnotatedBindingBuilder;

    move-result-object v0

    const-class v1, Lcom/thetransitapp/droid/data/OnlineTransitSource;

    invoke-interface {v0, v1}, Lcom/google/inject/binder/AnnotatedBindingBuilder;->to(Ljava/lang/Class;)Lcom/google/inject/binder/ScopedBindingBuilder;

    .line 13
    const-class v0, Lcom/thetransitapp/droid/widget/route/RouteAdapter$ActionCallback;

    invoke-interface {p1, v0}, Lcom/google/inject/Binder;->bind(Ljava/lang/Class;)Lcom/google/inject/binder/AnnotatedBindingBuilder;

    move-result-object v0

    const-class v1, Lcom/thetransitapp/droid/RoutesScreen;

    invoke-interface {v0, v1}, Lcom/google/inject/binder/AnnotatedBindingBuilder;->to(Ljava/lang/Class;)Lcom/google/inject/binder/ScopedBindingBuilder;

    .line 14
    return-void
.end method
