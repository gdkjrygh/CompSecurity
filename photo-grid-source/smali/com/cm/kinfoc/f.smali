.class public final Lcom/cm/kinfoc/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    const/4 v0, 0x0

    iput v0, p0, Lcom/cm/kinfoc/f;->a:I

    .line 11
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/cm/kinfoc/f;->b:Ljava/lang/Object;

    return-void
.end method
