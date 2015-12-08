.class public abstract Lroboguice/content/RoboContentProvider;
.super Landroid/content/ContentProvider;
.source "RoboContentProvider.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 13
    invoke-direct {p0}, Landroid/content/ContentProvider;-><init>()V

    return-void
.end method


# virtual methods
.method public onCreate()Z
    .locals 1

    .prologue
    .line 17
    invoke-virtual {p0}, Lroboguice/content/RoboContentProvider;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lroboguice/RoboGuice;->getInjector(Landroid/content/Context;)Lroboguice/inject/RoboInjector;

    move-result-object v0

    invoke-interface {v0, p0}, Lroboguice/inject/RoboInjector;->injectMembers(Ljava/lang/Object;)V

    .line 18
    const/4 v0, 0x1

    return v0
.end method
