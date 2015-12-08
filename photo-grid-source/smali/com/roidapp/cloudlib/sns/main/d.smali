.class public final Lcom/roidapp/cloudlib/sns/main/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field a:I

.field b:Z

.field c:Lcom/roidapp/cloudlib/sns/main/b;

.field d:Lcom/roidapp/cloudlib/sns/main/b;

.field e:Z


# direct methods
.method public constructor <init>(IZLcom/roidapp/cloudlib/sns/main/b;Lcom/roidapp/cloudlib/sns/main/b;)V
    .locals 6

    .prologue
    .line 56
    const/4 v5, 0x1

    move-object v0, p0

    move v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v5}, Lcom/roidapp/cloudlib/sns/main/d;-><init>(IZLcom/roidapp/cloudlib/sns/main/b;Lcom/roidapp/cloudlib/sns/main/b;Z)V

    .line 57
    return-void
.end method

.method public constructor <init>(IZLcom/roidapp/cloudlib/sns/main/b;Lcom/roidapp/cloudlib/sns/main/b;Z)V
    .locals 0

    .prologue
    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 60
    iput p1, p0, Lcom/roidapp/cloudlib/sns/main/d;->a:I

    .line 61
    iput-boolean p2, p0, Lcom/roidapp/cloudlib/sns/main/d;->b:Z

    .line 62
    iput-object p3, p0, Lcom/roidapp/cloudlib/sns/main/d;->c:Lcom/roidapp/cloudlib/sns/main/b;

    .line 63
    iput-object p4, p0, Lcom/roidapp/cloudlib/sns/main/d;->d:Lcom/roidapp/cloudlib/sns/main/b;

    .line 64
    iput-boolean p5, p0, Lcom/roidapp/cloudlib/sns/main/d;->e:Z

    .line 65
    return-void
.end method
