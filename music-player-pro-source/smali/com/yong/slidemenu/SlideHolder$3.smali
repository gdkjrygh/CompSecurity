.class Lcom/yong/slidemenu/SlideHolder$3;
.super Ljava/lang/Object;
.source "SlideHolder.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yong/slidemenu/SlideHolder;->open()Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/yong/slidemenu/SlideHolder;


# direct methods
.method constructor <init>(Lcom/yong/slidemenu/SlideHolder;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/yong/slidemenu/SlideHolder$3;->this$0:Lcom/yong/slidemenu/SlideHolder;

    .line 183
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 186
    iget-object v0, p0, Lcom/yong/slidemenu/SlideHolder$3;->this$0:Lcom/yong/slidemenu/SlideHolder;

    invoke-virtual {v0}, Lcom/yong/slidemenu/SlideHolder;->open()Z

    .line 187
    return-void
.end method
