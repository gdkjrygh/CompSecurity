.class Lorg/apache/cordova/CordovaWebView$ActivityResult;
.super Ljava/lang/Object;
.source "CordovaWebView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/apache/cordova/CordovaWebView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "ActivityResult"
.end annotation


# instance fields
.field incoming:Landroid/content/Intent;

.field request:I

.field result:I

.field final synthetic this$0:Lorg/apache/cordova/CordovaWebView;


# direct methods
.method public constructor <init>(Lorg/apache/cordova/CordovaWebView;IILandroid/content/Intent;)V
    .locals 0
    .param p1, "this$0"    # Lorg/apache/cordova/CordovaWebView;
    .param p2, "req"    # I
    .param p3, "res"    # I
    .param p4, "intent"    # Landroid/content/Intent;

    .prologue
    .line 106
    iput-object p1, p0, Lorg/apache/cordova/CordovaWebView$ActivityResult;->this$0:Lorg/apache/cordova/CordovaWebView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 107
    iput p2, p0, Lorg/apache/cordova/CordovaWebView$ActivityResult;->request:I

    .line 108
    iput p3, p0, Lorg/apache/cordova/CordovaWebView$ActivityResult;->result:I

    .line 109
    iput-object p4, p0, Lorg/apache/cordova/CordovaWebView$ActivityResult;->incoming:Landroid/content/Intent;

    .line 110
    return-void
.end method
