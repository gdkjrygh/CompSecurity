.class Lorg/apache/cordova/Echo$1;
.super Ljava/lang/Object;
.source "Echo.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/apache/cordova/Echo;->execute(Ljava/lang/String;Lorg/json/JSONArray;Lorg/apache/cordova/api/CallbackContext;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/apache/cordova/Echo;

.field final synthetic val$callbackContext:Lorg/apache/cordova/api/CallbackContext;

.field final synthetic val$result:Ljava/lang/String;


# direct methods
.method constructor <init>(Lorg/apache/cordova/Echo;Lorg/apache/cordova/api/CallbackContext;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 35
    iput-object p1, p0, Lorg/apache/cordova/Echo$1;->this$0:Lorg/apache/cordova/Echo;

    iput-object p2, p0, Lorg/apache/cordova/Echo$1;->val$callbackContext:Lorg/apache/cordova/api/CallbackContext;

    iput-object p3, p0, Lorg/apache/cordova/Echo$1;->val$result:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 37
    iget-object v0, p0, Lorg/apache/cordova/Echo$1;->val$callbackContext:Lorg/apache/cordova/api/CallbackContext;

    iget-object v1, p0, Lorg/apache/cordova/Echo$1;->val$result:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lorg/apache/cordova/api/CallbackContext;->success(Ljava/lang/String;)V

    .line 38
    return-void
.end method
