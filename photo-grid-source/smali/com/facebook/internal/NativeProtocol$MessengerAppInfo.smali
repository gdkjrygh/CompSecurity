.class Lcom/facebook/internal/NativeProtocol$MessengerAppInfo;
.super Lcom/facebook/internal/NativeProtocol$NativeAppInfo;
.source "SourceFile"


# static fields
.field static final MESSENGER_PACKAGE:Ljava/lang/String; = "com.facebook.orca"


# direct methods
.method private constructor <init>()V
    .locals 1

    .prologue
    .line 274
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/facebook/internal/NativeProtocol$NativeAppInfo;-><init>(Lcom/facebook/internal/NativeProtocol$1;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/internal/NativeProtocol$1;)V
    .locals 0

    .prologue
    .line 274
    invoke-direct {p0}, Lcom/facebook/internal/NativeProtocol$MessengerAppInfo;-><init>()V

    return-void
.end method


# virtual methods
.method protected getPackage()Ljava/lang/String;
    .locals 1

    .prologue
    .line 279
    const-string v0, "com.facebook.orca"

    return-object v0
.end method
