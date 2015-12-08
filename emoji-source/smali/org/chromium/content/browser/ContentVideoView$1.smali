.class Lorg/chromium/content/browser/ContentVideoView$1;
.super Ljava/lang/Object;
.source "ContentVideoView.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/chromium/content/browser/ContentVideoView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/chromium/content/browser/ContentVideoView;


# direct methods
.method constructor <init>(Lorg/chromium/content/browser/ContentVideoView;)V
    .locals 0

    .prologue
    .line 167
    iput-object p1, p0, Lorg/chromium/content/browser/ContentVideoView$1;->this$0:Lorg/chromium/content/browser/ContentVideoView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 170
    iget-object v0, p0, Lorg/chromium/content/browser/ContentVideoView$1;->this$0:Lorg/chromium/content/browser/ContentVideoView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lorg/chromium/content/browser/ContentVideoView;->exitFullscreen(Z)V

    .line 171
    return-void
.end method
