.class Lorg/apache/cordova/DroidGap$5$1;
.super Ljava/lang/Object;
.source "DroidGap.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/apache/cordova/DroidGap$5;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lorg/apache/cordova/DroidGap$5;


# direct methods
.method constructor <init>(Lorg/apache/cordova/DroidGap$5;)V
    .locals 0

    .prologue
    .line 998
    iput-object p1, p0, Lorg/apache/cordova/DroidGap$5$1;->this$1:Lorg/apache/cordova/DroidGap$5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 1000
    iget-object v0, p0, Lorg/apache/cordova/DroidGap$5$1;->this$1:Lorg/apache/cordova/DroidGap$5;

    iget-object v0, v0, Lorg/apache/cordova/DroidGap$5;->this$0:Lorg/apache/cordova/DroidGap;

    invoke-virtual {v0}, Lorg/apache/cordova/DroidGap;->removeSplashScreen()V

    .line 1001
    return-void
.end method
