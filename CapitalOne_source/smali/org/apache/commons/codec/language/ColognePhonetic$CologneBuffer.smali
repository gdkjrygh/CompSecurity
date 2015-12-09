.class abstract Lorg/apache/commons/codec/language/ColognePhonetic$CologneBuffer;
.super Ljava/lang/Object;
.source "ColognePhonetic.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/apache/commons/codec/language/ColognePhonetic;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x402
    name = "CologneBuffer"
.end annotation


# instance fields
.field protected final data:[C

.field protected length:I

.field final synthetic this$0:Lorg/apache/commons/codec/language/ColognePhonetic;


# direct methods
.method public constructor <init>(Lorg/apache/commons/codec/language/ColognePhonetic;I)V
    .locals 2
    .param p2, "buffSize"    # I

    .prologue
    const/4 v1, 0x0

    .line 198
    iput-object p1, p0, Lorg/apache/commons/codec/language/ColognePhonetic$CologneBuffer;->this$0:Lorg/apache/commons/codec/language/ColognePhonetic;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 191
    iput v1, p0, Lorg/apache/commons/codec/language/ColognePhonetic$CologneBuffer;->length:I

    .line 199
    new-array v0, p2, [C

    iput-object v0, p0, Lorg/apache/commons/codec/language/ColognePhonetic$CologneBuffer;->data:[C

    .line 200
    iput v1, p0, Lorg/apache/commons/codec/language/ColognePhonetic$CologneBuffer;->length:I

    .line 201
    return-void
.end method

.method public constructor <init>(Lorg/apache/commons/codec/language/ColognePhonetic;[C)V
    .locals 1
    .param p2, "data"    # [C

    .prologue
    .line 193
    iput-object p1, p0, Lorg/apache/commons/codec/language/ColognePhonetic$CologneBuffer;->this$0:Lorg/apache/commons/codec/language/ColognePhonetic;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 191
    const/4 v0, 0x0

    iput v0, p0, Lorg/apache/commons/codec/language/ColognePhonetic$CologneBuffer;->length:I

    .line 194
    iput-object p2, p0, Lorg/apache/commons/codec/language/ColognePhonetic$CologneBuffer;->data:[C

    .line 195
    array-length v0, p2

    iput v0, p0, Lorg/apache/commons/codec/language/ColognePhonetic$CologneBuffer;->length:I

    .line 196
    return-void
.end method


# virtual methods
.method protected abstract copyData(II)[C
.end method

.method public length()I
    .locals 1

    .prologue
    .line 206
    iget v0, p0, Lorg/apache/commons/codec/language/ColognePhonetic$CologneBuffer;->length:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .prologue
    .line 211
    new-instance v0, Ljava/lang/String;

    const/4 v1, 0x0

    iget v2, p0, Lorg/apache/commons/codec/language/ColognePhonetic$CologneBuffer;->length:I

    invoke-virtual {p0, v1, v2}, Lorg/apache/commons/codec/language/ColognePhonetic$CologneBuffer;->copyData(II)[C

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([C)V

    return-object v0
.end method
