.class Lcom/hmobile/biblekjv/MainBookActivity$12;
.super Ljava/lang/Object;
.source "MainBookActivity.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/hmobile/biblekjv/MainBookActivity;->onUtteranceCompleted(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/hmobile/biblekjv/MainBookActivity;


# direct methods
.method constructor <init>(Lcom/hmobile/biblekjv/MainBookActivity;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/hmobile/biblekjv/MainBookActivity$12;->this$0:Lcom/hmobile/biblekjv/MainBookActivity;

    .line 1194
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 1197
    iget-object v0, p0, Lcom/hmobile/biblekjv/MainBookActivity$12;->this$0:Lcom/hmobile/biblekjv/MainBookActivity;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/hmobile/biblekjv/MainBookActivity;->isTTsContinue:Z

    .line 1198
    iget-object v0, p0, Lcom/hmobile/biblekjv/MainBookActivity$12;->this$0:Lcom/hmobile/biblekjv/MainBookActivity;

    # invokes: Lcom/hmobile/biblekjv/MainBookActivity;->clickNext()V
    invoke-static {v0}, Lcom/hmobile/biblekjv/MainBookActivity;->access$25(Lcom/hmobile/biblekjv/MainBookActivity;)V

    .line 1199
    return-void
.end method
