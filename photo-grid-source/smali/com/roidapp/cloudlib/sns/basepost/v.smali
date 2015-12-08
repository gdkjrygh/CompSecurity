.class public Lcom/roidapp/cloudlib/sns/basepost/v;
.super Lcom/roidapp/cloudlib/sns/basepost/g;
.source "SourceFile"


# instance fields
.field private d:Z

.field private e:J

.field private f:I


# direct methods
.method public constructor <init>(IIJI)V
    .locals 1

    .prologue
    .line 15
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/basepost/g;-><init>()V

    .line 16
    iput-wide p3, p0, Lcom/roidapp/cloudlib/sns/basepost/v;->e:J

    .line 17
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/basepost/v;->d:Z

    .line 18
    iput p5, p0, Lcom/roidapp/cloudlib/sns/basepost/v;->f:I

    .line 20
    iput p1, p0, Lcom/roidapp/cloudlib/sns/basepost/v;->b:I

    .line 21
    iput p2, p0, Lcom/roidapp/cloudlib/sns/basepost/v;->c:I

    .line 22
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .prologue
    .line 30
    iget v0, p0, Lcom/roidapp/cloudlib/sns/basepost/v;->f:I

    return v0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 0

    .prologue
    .line 36
    return-void
.end method

.method public updateDrawState(Landroid/text/TextPaint;)V
    .locals 1

    .prologue
    .line 41
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/basepost/v;->a:Z

    if-eqz v0, :cond_0

    .line 42
    iget v0, p0, Lcom/roidapp/cloudlib/sns/basepost/v;->c:I

    invoke-virtual {p1, v0}, Landroid/text/TextPaint;->setColor(I)V

    .line 46
    :goto_0
    return-void

    .line 44
    :cond_0
    iget v0, p0, Lcom/roidapp/cloudlib/sns/basepost/v;->b:I

    invoke-virtual {p1, v0}, Landroid/text/TextPaint;->setColor(I)V

    goto :goto_0
.end method
