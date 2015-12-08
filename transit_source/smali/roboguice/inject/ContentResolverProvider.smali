.class public Lroboguice/inject/ContentResolverProvider;
.super Ljava/lang/Object;
.source "ContentResolverProvider.java"

# interfaces
.implements Lcom/google/inject/Provider;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/inject/Provider",
        "<",
        "Landroid/content/ContentResolver;",
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
    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public get()Landroid/content/ContentResolver;
    .locals 1

    .prologue
    .line 33
    iget-object v0, p0, Lroboguice/inject/ContentResolverProvider;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 27
    invoke-virtual {p0}, Lroboguice/inject/ContentResolverProvider;->get()Landroid/content/ContentResolver;

    move-result-object v0

    return-object v0
.end method
