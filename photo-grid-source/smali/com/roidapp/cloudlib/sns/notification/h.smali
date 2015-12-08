.class final Lcom/roidapp/cloudlib/sns/notification/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/cloudlib/sns/b/m;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Lcom/roidapp/cloudlib/sns/b/h;

.field final synthetic e:I

.field final synthetic f:Lcom/roidapp/cloudlib/sns/notification/f;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/sns/notification/f;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/roidapp/cloudlib/sns/b/h;I)V
    .locals 0

    .prologue
    .line 284
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/notification/h;->f:Lcom/roidapp/cloudlib/sns/notification/f;

    iput-object p2, p0, Lcom/roidapp/cloudlib/sns/notification/h;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/roidapp/cloudlib/sns/notification/h;->b:Ljava/lang/String;

    iput-object p4, p0, Lcom/roidapp/cloudlib/sns/notification/h;->c:Ljava/lang/String;

    iput-object p5, p0, Lcom/roidapp/cloudlib/sns/notification/h;->d:Lcom/roidapp/cloudlib/sns/b/h;

    iput p6, p0, Lcom/roidapp/cloudlib/sns/notification/h;->e:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/roidapp/cloudlib/sns/basepost/PostCommentsTextView;Ljava/lang/String;)V
    .locals 7

    .prologue
    .line 288
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/h;->f:Lcom/roidapp/cloudlib/sns/notification/f;

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/notification/h;->a:Ljava/lang/String;

    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/notification/h;->b:Ljava/lang/String;

    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/notification/h;->c:Ljava/lang/String;

    iget-object v4, p0, Lcom/roidapp/cloudlib/sns/notification/h;->d:Lcom/roidapp/cloudlib/sns/b/h;

    iget v5, p0, Lcom/roidapp/cloudlib/sns/notification/h;->e:I

    move-object v6, p1

    invoke-static/range {v0 .. v6}, Lcom/roidapp/cloudlib/sns/notification/f;->a(Lcom/roidapp/cloudlib/sns/notification/f;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/roidapp/cloudlib/sns/b/h;ILcom/roidapp/cloudlib/sns/basepost/PostCommentsTextView;)V

    .line 289
    return-void
.end method
