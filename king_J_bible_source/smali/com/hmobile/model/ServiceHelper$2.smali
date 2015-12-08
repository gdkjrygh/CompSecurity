.class Lcom/hmobile/model/ServiceHelper$2;
.super Ljava/lang/Object;
.source "ServiceHelper.java"

# interfaces
.implements Lorg/apache/http/conn/ConnectionKeepAliveStrategy;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/hmobile/model/ServiceHelper;->call(Ljava/lang/String;)Ljava/lang/String;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/hmobile/model/ServiceHelper;


# direct methods
.method constructor <init>(Lcom/hmobile/model/ServiceHelper;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/hmobile/model/ServiceHelper$2;->this$0:Lcom/hmobile/model/ServiceHelper;

    .line 92
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getKeepAliveDuration(Lorg/apache/http/HttpResponse;Lorg/apache/http/protocol/HttpContext;)J
    .locals 2
    .param p1, "response"    # Lorg/apache/http/HttpResponse;
    .param p2, "context"    # Lorg/apache/http/protocol/HttpContext;

    .prologue
    .line 96
    const-wide/32 v0, 0x30d40

    return-wide v0
.end method
