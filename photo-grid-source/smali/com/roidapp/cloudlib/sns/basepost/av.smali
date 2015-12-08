.class public Lcom/roidapp/cloudlib/sns/basepost/av;
.super Lcom/roidapp/cloudlib/sns/basepost/g;
.source "SourceFile"


# instance fields
.field private d:J

.field private e:Lcom/roidapp/cloudlib/sns/b/x;

.field private f:Z

.field private g:Ljava/lang/String;


# direct methods
.method public constructor <init>(IILcom/roidapp/cloudlib/sns/b/x;)V
    .locals 2

    .prologue
    .line 17
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/basepost/g;-><init>()V

    .line 18
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/basepost/av;->f:Z

    .line 19
    iput-object p3, p0, Lcom/roidapp/cloudlib/sns/basepost/av;->e:Lcom/roidapp/cloudlib/sns/b/x;

    .line 20
    if-eqz p3, :cond_0

    .line 21
    iget-wide v0, p3, Lcom/roidapp/cloudlib/sns/b/x;->a:J

    iput-wide v0, p0, Lcom/roidapp/cloudlib/sns/basepost/av;->d:J

    .line 22
    iget-object v0, p3, Lcom/roidapp/cloudlib/sns/b/x;->b:Ljava/lang/String;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/av;->g:Ljava/lang/String;

    .line 24
    :cond_0
    iput p1, p0, Lcom/roidapp/cloudlib/sns/basepost/av;->b:I

    .line 25
    iput p2, p0, Lcom/roidapp/cloudlib/sns/basepost/av;->c:I

    .line 27
    return-void
.end method

.method public constructor <init>(IILjava/lang/String;Z)V
    .locals 0

    .prologue
    .line 29
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/basepost/g;-><init>()V

    .line 30
    iput-object p3, p0, Lcom/roidapp/cloudlib/sns/basepost/av;->g:Ljava/lang/String;

    .line 31
    iput-boolean p4, p0, Lcom/roidapp/cloudlib/sns/basepost/av;->f:Z

    .line 33
    iput p1, p0, Lcom/roidapp/cloudlib/sns/basepost/av;->b:I

    .line 34
    iput p2, p0, Lcom/roidapp/cloudlib/sns/basepost/av;->c:I

    .line 36
    return-void
.end method


# virtual methods
.method public final a()Lcom/roidapp/cloudlib/sns/b/x;
    .locals 1

    .prologue
    .line 43
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/av;->e:Lcom/roidapp/cloudlib/sns/b/x;

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 47
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/av;->g:Ljava/lang/String;

    return-object v0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 0

    .prologue
    .line 53
    return-void
.end method

.method public updateDrawState(Landroid/text/TextPaint;)V
    .locals 1

    .prologue
    .line 58
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/basepost/av;->a:Z

    if-eqz v0, :cond_0

    .line 59
    iget v0, p0, Lcom/roidapp/cloudlib/sns/basepost/av;->c:I

    invoke-virtual {p1, v0}, Landroid/text/TextPaint;->setColor(I)V

    .line 64
    :goto_0
    return-void

    .line 61
    :cond_0
    iget v0, p0, Lcom/roidapp/cloudlib/sns/basepost/av;->b:I

    invoke-virtual {p1, v0}, Landroid/text/TextPaint;->setColor(I)V

    goto :goto_0
.end method
