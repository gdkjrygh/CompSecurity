.class Lcom/squareup/okhttp/internal/spdy/SpdyConnection$2;
.super Lcom/squareup/okhttp/internal/NamedRunnable;
.source "SpdyConnection.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/squareup/okhttp/internal/spdy/SpdyConnection;->writeWindowUpdateLater(II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/squareup/okhttp/internal/spdy/SpdyConnection;

.field final synthetic val$deltaWindowSize:I

.field final synthetic val$streamId:I


# direct methods
.method varargs constructor <init>(Lcom/squareup/okhttp/internal/spdy/SpdyConnection;Ljava/lang/String;[Ljava/lang/Object;II)V
    .locals 0
    .param p1, "this$0"    # Lcom/squareup/okhttp/internal/spdy/SpdyConnection;
    .param p2, "format"    # Ljava/lang/String;
    .param p3, "args"    # [Ljava/lang/Object;

    .prologue
    .line 207
    iput-object p1, p0, Lcom/squareup/okhttp/internal/spdy/SpdyConnection$2;->this$0:Lcom/squareup/okhttp/internal/spdy/SpdyConnection;

    iput p4, p0, Lcom/squareup/okhttp/internal/spdy/SpdyConnection$2;->val$streamId:I

    iput p5, p0, Lcom/squareup/okhttp/internal/spdy/SpdyConnection$2;->val$deltaWindowSize:I

    invoke-direct {p0, p2, p3}, Lcom/squareup/okhttp/internal/NamedRunnable;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public execute()V
    .locals 3

    .prologue
    .line 210
    :try_start_0
    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyConnection$2;->this$0:Lcom/squareup/okhttp/internal/spdy/SpdyConnection;

    iget v1, p0, Lcom/squareup/okhttp/internal/spdy/SpdyConnection$2;->val$streamId:I

    iget v2, p0, Lcom/squareup/okhttp/internal/spdy/SpdyConnection$2;->val$deltaWindowSize:I

    invoke-virtual {v0, v1, v2}, Lcom/squareup/okhttp/internal/spdy/SpdyConnection;->writeWindowUpdate(II)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 213
    :goto_0
    return-void

    .line 211
    :catch_0
    move-exception v0

    goto :goto_0
.end method
