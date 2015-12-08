.class public Lroboguice/inject/AssetManagerProvider;
.super Ljava/lang/Object;
.source "AssetManagerProvider.java"

# interfaces
.implements Lcom/google/inject/Provider;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/inject/Provider",
        "<",
        "Landroid/content/res/AssetManager;",
        ">;"
    }
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
.method public get()Landroid/content/res/AssetManager;
    .locals 1

    .prologue
    .line 13
    iget-object v0, p0, Lroboguice/inject/AssetManagerProvider;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 9
    invoke-virtual {p0}, Lroboguice/inject/AssetManagerProvider;->get()Landroid/content/res/AssetManager;

    move-result-object v0

    return-object v0
.end method
