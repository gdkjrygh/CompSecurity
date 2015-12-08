.class final Lcom/roidapp/cloudlib/sns/basepost/af;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/cloudlib/sns/basepost/bb;


# instance fields
.field final synthetic a:J

.field final synthetic b:Lcom/roidapp/cloudlib/sns/basepost/ad;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/sns/basepost/ad;J)V
    .locals 0

    .prologue
    .line 904
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/basepost/af;->b:Lcom/roidapp/cloudlib/sns/basepost/ad;

    iput-wide p2, p0, Lcom/roidapp/cloudlib/sns/basepost/af;->a:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    .prologue
    .line 907
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/af;->b:Lcom/roidapp/cloudlib/sns/basepost/ad;

    iget-wide v2, p0, Lcom/roidapp/cloudlib/sns/basepost/af;->a:J

    invoke-static {v0, v2, v3}, Lcom/roidapp/cloudlib/sns/basepost/ad;->a(Lcom/roidapp/cloudlib/sns/basepost/ad;J)V

    .line 908
    return-void
.end method
