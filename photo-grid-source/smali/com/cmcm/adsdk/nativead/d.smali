.class public abstract Lcom/cmcm/adsdk/nativead/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/cmcm/a/a/a;


# instance fields
.field protected a:Z

.field protected b:Lcom/cmcm/a/a/b;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/cmcm/adsdk/nativead/d;->a:Z

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 22
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/cmcm/adsdk/nativead/d;->a:Z

    .line 23
    return-void
.end method

.method public final b()Lcom/cmcm/a/a/b;
    .locals 1

    .prologue
    .line 34
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/d;->b:Lcom/cmcm/a/a/b;

    return-object v0
.end method
