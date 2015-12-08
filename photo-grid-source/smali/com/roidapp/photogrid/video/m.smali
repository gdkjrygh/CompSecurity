.class public final Lcom/roidapp/photogrid/video/m;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:Ljava/lang/String;

.field public c:Z

.field public d:Z

.field public e:I


# direct methods
.method public constructor <init>(ILjava/lang/String;I)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput p1, p0, Lcom/roidapp/photogrid/video/m;->a:I

    .line 17
    iput-object p2, p0, Lcom/roidapp/photogrid/video/m;->b:Ljava/lang/String;

    .line 18
    iput-boolean v0, p0, Lcom/roidapp/photogrid/video/m;->c:Z

    .line 19
    iput-boolean v0, p0, Lcom/roidapp/photogrid/video/m;->d:Z

    .line 20
    iput p3, p0, Lcom/roidapp/photogrid/video/m;->e:I

    .line 21
    return-void
.end method
