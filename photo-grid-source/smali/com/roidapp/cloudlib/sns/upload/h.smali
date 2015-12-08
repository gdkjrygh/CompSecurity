.class final Lcom/roidapp/cloudlib/sns/upload/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/sns/upload/e;


# direct methods
.method private constructor <init>(Lcom/roidapp/cloudlib/sns/upload/e;)V
    .locals 0

    .prologue
    .line 496
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/upload/h;->a:Lcom/roidapp/cloudlib/sns/upload/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/roidapp/cloudlib/sns/upload/e;B)V
    .locals 0

    .prologue
    .line 496
    invoke-direct {p0, p1}, Lcom/roidapp/cloudlib/sns/upload/h;-><init>(Lcom/roidapp/cloudlib/sns/upload/e;)V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 500
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/upload/h;->a:Lcom/roidapp/cloudlib/sns/upload/e;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/upload/e;->c(Lcom/roidapp/cloudlib/sns/upload/e;)V

    .line 501
    return-void
.end method
