.class Lorg/apache/cordova/statusbar/StatusBar$2;
.super Ljava/lang/Object;
.source "StatusBar.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/apache/cordova/statusbar/StatusBar;->execute(Ljava/lang/String;Lorg/apache/cordova/CordovaArgs;Lorg/apache/cordova/CallbackContext;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/apache/cordova/statusbar/StatusBar;

.field final synthetic val$window:Landroid/view/Window;


# direct methods
.method constructor <init>(Lorg/apache/cordova/statusbar/StatusBar;Landroid/view/Window;)V
    .locals 0
    .param p1, "this$0"    # Lorg/apache/cordova/statusbar/StatusBar;

    .prologue
    .line 80
    iput-object p1, p0, Lorg/apache/cordova/statusbar/StatusBar$2;->this$0:Lorg/apache/cordova/statusbar/StatusBar;

    iput-object p2, p0, Lorg/apache/cordova/statusbar/StatusBar$2;->val$window:Landroid/view/Window;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 83
    iget-object v0, p0, Lorg/apache/cordova/statusbar/StatusBar$2;->val$window:Landroid/view/Window;

    const/16 v1, 0x400

    invoke-virtual {v0, v1}, Landroid/view/Window;->clearFlags(I)V

    .line 84
    return-void
.end method
