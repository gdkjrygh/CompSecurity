.class public final Lcom/roidapp/cloudlib/common/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/String;

.field public b:I

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    const-string v0, ""

    iput-object v0, p0, Lcom/roidapp/cloudlib/common/b;->a:Ljava/lang/String;

    .line 32
    const/4 v0, 0x0

    iput v0, p0, Lcom/roidapp/cloudlib/common/b;->b:I

    .line 33
    const-string v0, ""

    iput-object v0, p0, Lcom/roidapp/cloudlib/common/b;->c:Ljava/lang/String;

    .line 34
    const-string v0, ""

    iput-object v0, p0, Lcom/roidapp/cloudlib/common/b;->d:Ljava/lang/String;

    .line 35
    const-string v0, ""

    iput-object v0, p0, Lcom/roidapp/cloudlib/common/b;->e:Ljava/lang/String;

    return-void
.end method
