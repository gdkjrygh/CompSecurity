.class public final Lcom/roidapp/photogrid/release/rg;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field protected a:I

.field protected b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field protected c:F

.field protected d:F

.field protected e:F

.field protected f:I

.field protected g:F

.field protected h:F

.field protected i:Lcom/roidapp/cloudlib/template/f;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/roidapp/photogrid/release/rg;->g:F

    .line 30
    const/4 v0, 0x0

    iput v0, p0, Lcom/roidapp/photogrid/release/rg;->h:F

    .line 20
    return-void
.end method
