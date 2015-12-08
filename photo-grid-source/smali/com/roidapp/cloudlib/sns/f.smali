.class final Lcom/roidapp/cloudlib/sns/f;
.super Landroid/database/AbstractCursor;
.source "SourceFile"


# instance fields
.field private a:[Ljava/lang/String;


# direct methods
.method private varargs constructor <init>([Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 89
    invoke-direct {p0}, Landroid/database/AbstractCursor;-><init>()V

    .line 90
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/f;->a:[Ljava/lang/String;

    .line 91
    return-void
.end method

.method synthetic constructor <init>([Ljava/lang/String;B)V
    .locals 0

    .prologue
    .line 85
    invoke-direct {p0, p1}, Lcom/roidapp/cloudlib/sns/f;-><init>([Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method protected final checkPosition()V
    .locals 0

    .prologue
    .line 95
    invoke-super {p0}, Landroid/database/AbstractCursor;->checkPosition()V

    .line 96
    return-void
.end method

.method public final getColumnNames()[Ljava/lang/String;
    .locals 1

    .prologue
    .line 105
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/f;->a:[Ljava/lang/String;

    return-object v0
.end method

.method public final getCount()I
    .locals 1

    .prologue
    .line 100
    const/4 v0, 0x1

    return v0
.end method

.method public final getDouble(I)D
    .locals 2

    .prologue
    .line 135
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public final getFloat(I)F
    .locals 1

    .prologue
    .line 130
    const/4 v0, 0x0

    return v0
.end method

.method public final getInt(I)I
    .locals 1

    .prologue
    .line 120
    const/4 v0, 0x0

    return v0
.end method

.method public final getLong(I)J
    .locals 2

    .prologue
    .line 125
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public final getShort(I)S
    .locals 1

    .prologue
    .line 115
    const/4 v0, 0x0

    return v0
.end method

.method public final getString(I)Ljava/lang/String;
    .locals 1

    .prologue
    .line 110
    const/4 v0, 0x0

    return-object v0
.end method

.method public final isNull(I)Z
    .locals 1

    .prologue
    .line 140
    const/4 v0, 0x0

    return v0
.end method
