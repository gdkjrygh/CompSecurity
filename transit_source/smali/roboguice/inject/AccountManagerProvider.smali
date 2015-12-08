.class public Lroboguice/inject/AccountManagerProvider;
.super Ljava/lang/Object;
.source "AccountManagerProvider.java"

# interfaces
.implements Lcom/google/inject/Provider;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/inject/Provider",
        "<",
        "Landroid/accounts/AccountManager;",
        ">;"
    }
.end annotation

.annotation runtime Lroboguice/inject/ContextSingleton;
.end annotation


# instance fields
.field protected context:Landroid/content/Context;
    .annotation runtime Lcom/google/inject/Inject;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public get()Landroid/accounts/AccountManager;
    .locals 1

    .prologue
    .line 13
    iget-object v0, p0, Lroboguice/inject/AccountManagerProvider;->context:Landroid/content/Context;

    invoke-static {v0}, Landroid/accounts/AccountManager;->get(Landroid/content/Context;)Landroid/accounts/AccountManager;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 8
    invoke-virtual {p0}, Lroboguice/inject/AccountManagerProvider;->get()Landroid/accounts/AccountManager;

    move-result-object v0

    return-object v0
.end method
