.class final Lcom/roidapp/videolib/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/roidapp/videolib/g;


# direct methods
.method constructor <init>(Lcom/roidapp/videolib/g;)V
    .locals 0

    .prologue
    .line 82
    iput-object p1, p0, Lcom/roidapp/videolib/i;->a:Lcom/roidapp/videolib/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    .line 85
    iget-object v0, p0, Lcom/roidapp/videolib/i;->a:Lcom/roidapp/videolib/g;

    const/4 v1, 0x0

    const-string v2, ""

    invoke-static {v0, v1, v2}, Lcom/roidapp/videolib/g;->a(Lcom/roidapp/videolib/g;ZLjava/lang/String;)V

    .line 86
    return-void
.end method
