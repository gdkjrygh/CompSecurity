.class public Lcom/roidapp/cloudlib/sns/basepost/bu;
.super Lcom/roidapp/cloudlib/sns/basepost/g;
.source "SourceFile"


# instance fields
.field private d:Z

.field private e:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;IIZ)V
    .locals 0

    .prologue
    .line 11
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/basepost/g;-><init>()V

    .line 12
    iput-boolean p4, p0, Lcom/roidapp/cloudlib/sns/basepost/bu;->d:Z

    .line 13
    iput-boolean p4, p0, Lcom/roidapp/cloudlib/sns/basepost/bu;->d:Z

    .line 14
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/basepost/bu;->e:Ljava/lang/String;

    .line 15
    iput p2, p0, Lcom/roidapp/cloudlib/sns/basepost/bu;->b:I

    .line 16
    iput p3, p0, Lcom/roidapp/cloudlib/sns/basepost/bu;->c:I

    .line 18
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 21
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bu;->e:Ljava/lang/String;

    return-object v0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 0

    .prologue
    .line 27
    return-void
.end method

.method public updateDrawState(Landroid/text/TextPaint;)V
    .locals 1

    .prologue
    .line 32
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bu;->a:Z

    if-eqz v0, :cond_0

    .line 33
    iget v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bu;->c:I

    invoke-virtual {p1, v0}, Landroid/text/TextPaint;->setColor(I)V

    .line 38
    :goto_0
    return-void

    .line 35
    :cond_0
    iget v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bu;->b:I

    invoke-virtual {p1, v0}, Landroid/text/TextPaint;->setColor(I)V

    goto :goto_0
.end method
