.class Lorg/apache/cordova/AccelListener$1;
.super Ljava/lang/Object;
.source "AccelListener.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/apache/cordova/AccelListener;->start()I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/apache/cordova/AccelListener;


# direct methods
.method constructor <init>(Lorg/apache/cordova/AccelListener;)V
    .locals 0

    .prologue
    .line 158
    iput-object p1, p0, Lorg/apache/cordova/AccelListener$1;->this$0:Lorg/apache/cordova/AccelListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 160
    iget-object v0, p0, Lorg/apache/cordova/AccelListener$1;->this$0:Lorg/apache/cordova/AccelListener;

    # invokes: Lorg/apache/cordova/AccelListener;->timeout()V
    invoke-static {v0}, Lorg/apache/cordova/AccelListener;->access$000(Lorg/apache/cordova/AccelListener;)V

    .line 161
    return-void
.end method
