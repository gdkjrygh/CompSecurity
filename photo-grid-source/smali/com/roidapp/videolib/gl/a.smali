.class public final Lcom/roidapp/videolib/gl/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Landroid/graphics/Bitmap;

.field public c:[F

.field public d:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/roidapp/videolib/gl/a;->a:Ljava/lang/Object;

    .line 8
    const/16 v0, 0x8

    new-array v0, v0, [F

    iput-object v0, p0, Lcom/roidapp/videolib/gl/a;->c:[F

    return-void
.end method
