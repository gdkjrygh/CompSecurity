.class Lcom/coremedia/iso/AbstractBoxParser$1;
.super Ljava/lang/ThreadLocal;
.source "SourceFile"


# instance fields
.field final synthetic this$0:Lcom/coremedia/iso/AbstractBoxParser;


# direct methods
.method constructor <init>(Lcom/coremedia/iso/AbstractBoxParser;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/coremedia/iso/AbstractBoxParser$1;->this$0:Lcom/coremedia/iso/AbstractBoxParser;

    .line 34
    invoke-direct {p0}, Ljava/lang/ThreadLocal;-><init>()V

    return-void
.end method


# virtual methods
.method protected bridge synthetic initialValue()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1
    invoke-virtual {p0}, Lcom/coremedia/iso/AbstractBoxParser$1;->initialValue()Ljava/nio/ByteBuffer;

    move-result-object v0

    return-object v0
.end method

.method protected initialValue()Ljava/nio/ByteBuffer;
    .locals 1

    .prologue
    .line 37
    const/16 v0, 0x20

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    return-object v0
.end method
