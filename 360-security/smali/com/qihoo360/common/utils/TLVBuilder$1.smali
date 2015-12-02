.class Lcom/qihoo360/common/utils/TLVBuilder$1;
.super Lcom/qihoo360/common/utils/TLVParseHelper;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo360/common/utils/TLVBuilder;->b()Lcom/qihoo360/common/utils/TLVParseHelper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo360/common/utils/TLVBuilder;


# direct methods
.method constructor <init>(Lcom/qihoo360/common/utils/TLVBuilder;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/qihoo360/common/utils/TLVBuilder$1;->a:Lcom/qihoo360/common/utils/TLVBuilder;

    .line 119
    invoke-direct {p0}, Lcom/qihoo360/common/utils/TLVParseHelper;-><init>()V

    return-void
.end method


# virtual methods
.method public getDataTypeFromId(I)Lcom/qihoo360/common/utils/TLVBuilder$DataType;
    .locals 2

    .prologue
    .line 123
    const/4 v0, 0x0

    .line 124
    rem-int/lit8 v1, p1, 0xa

    packed-switch v1, :pswitch_data_0

    .line 142
    :goto_0
    return-object v0

    .line 126
    :pswitch_0
    sget-object v0, Lcom/qihoo360/common/utils/TLVBuilder$DataType;->DT_INT:Lcom/qihoo360/common/utils/TLVBuilder$DataType;

    goto :goto_0

    .line 130
    :pswitch_1
    sget-object v0, Lcom/qihoo360/common/utils/TLVBuilder$DataType;->DT_LONG:Lcom/qihoo360/common/utils/TLVBuilder$DataType;

    goto :goto_0

    .line 134
    :pswitch_2
    sget-object v0, Lcom/qihoo360/common/utils/TLVBuilder$DataType;->DT_STRING:Lcom/qihoo360/common/utils/TLVBuilder$DataType;

    goto :goto_0

    .line 138
    :pswitch_3
    sget-object v0, Lcom/qihoo360/common/utils/TLVBuilder$DataType;->DT_BYTES:Lcom/qihoo360/common/utils/TLVBuilder$DataType;

    goto :goto_0

    .line 124
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method
