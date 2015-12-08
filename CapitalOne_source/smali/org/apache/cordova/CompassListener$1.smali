.class Lorg/apache/cordova/CompassListener$1;
.super Ljava/lang/Object;
.source "CompassListener.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/apache/cordova/CompassListener;->execute(Ljava/lang/String;Lorg/json/JSONArray;Lorg/apache/cordova/api/CallbackContext;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/apache/cordova/CompassListener;


# direct methods
.method constructor <init>(Lorg/apache/cordova/CompassListener;)V
    .locals 0

    .prologue
    .line 114
    iput-object p1, p0, Lorg/apache/cordova/CompassListener$1;->this$0:Lorg/apache/cordova/CompassListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 116
    iget-object v0, p0, Lorg/apache/cordova/CompassListener$1;->this$0:Lorg/apache/cordova/CompassListener;

    # invokes: Lorg/apache/cordova/CompassListener;->timeout()V
    invoke-static {v0}, Lorg/apache/cordova/CompassListener;->access$000(Lorg/apache/cordova/CompassListener;)V

    .line 117
    return-void
.end method
