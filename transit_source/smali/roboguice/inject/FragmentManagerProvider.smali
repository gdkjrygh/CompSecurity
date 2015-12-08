.class public Lroboguice/inject/FragmentManagerProvider;
.super Ljava/lang/Object;
.source "FragmentManagerProvider.java"

# interfaces
.implements Lcom/google/inject/Provider;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/inject/Provider",
        "<",
        "Landroid/support/v4/app/FragmentManager;",
        ">;"
    }
.end annotation

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
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public get()Landroid/support/v4/app/FragmentManager;
    .locals 1

    .prologue
    .line 17
    iget-object v0, p0, Lroboguice/inject/FragmentManagerProvider;->activity:Landroid/app/Activity;

    check-cast v0, Landroid/support/v4/app/FragmentActivity;

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 10
    invoke-virtual {p0}, Lroboguice/inject/FragmentManagerProvider;->get()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    return-object v0
.end method
