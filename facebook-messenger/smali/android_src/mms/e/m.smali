.class Landroid_src/mms/e/m;
.super Ljava/lang/Object;
.source "PduComposer.java"


# instance fields
.field a:I

.field final synthetic b:Landroid_src/mms/e/k;

.field private c:Landroid_src/mms/e/n;

.field private d:Landroid_src/mms/e/n;


# direct methods
.method private constructor <init>(Landroid_src/mms/e/k;)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 1056
    iput-object p1, p0, Landroid_src/mms/e/m;->b:Landroid_src/mms/e/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1057
    iput-object v0, p0, Landroid_src/mms/e/m;->c:Landroid_src/mms/e/n;

    .line 1058
    iput-object v0, p0, Landroid_src/mms/e/m;->d:Landroid_src/mms/e/n;

    .line 1060
    const/4 v0, 0x0

    iput v0, p0, Landroid_src/mms/e/m;->a:I

    return-void
.end method

.method synthetic constructor <init>(Landroid_src/mms/e/k;Landroid_src/mms/e/l;)V
    .locals 0

    .prologue
    .line 1056
    invoke-direct {p0, p1}, Landroid_src/mms/e/m;-><init>(Landroid_src/mms/e/k;)V

    return-void
.end method


# virtual methods
.method a()V
    .locals 2

    .prologue
    .line 1069
    iget-object v0, p0, Landroid_src/mms/e/m;->d:Landroid_src/mms/e/n;

    if-eqz v0, :cond_0

    .line 1070
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "BUG: Invalid newbuf() before copy()"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1073
    :cond_0
    new-instance v0, Landroid_src/mms/e/n;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroid_src/mms/e/n;-><init>(Landroid_src/mms/e/l;)V

    .line 1075
    iget-object v1, p0, Landroid_src/mms/e/m;->b:Landroid_src/mms/e/k;

    iget-object v1, v1, Landroid_src/mms/e/k;->a:Ljava/io/ByteArrayOutputStream;

    iput-object v1, v0, Landroid_src/mms/e/n;->a:Ljava/io/ByteArrayOutputStream;

    .line 1076
    iget-object v1, p0, Landroid_src/mms/e/m;->b:Landroid_src/mms/e/k;

    iget v1, v1, Landroid_src/mms/e/k;->b:I

    iput v1, v0, Landroid_src/mms/e/n;->b:I

    .line 1078
    iget-object v1, p0, Landroid_src/mms/e/m;->c:Landroid_src/mms/e/n;

    iput-object v1, v0, Landroid_src/mms/e/n;->c:Landroid_src/mms/e/n;

    .line 1079
    iput-object v0, p0, Landroid_src/mms/e/m;->c:Landroid_src/mms/e/n;

    .line 1081
    iget v0, p0, Landroid_src/mms/e/m;->a:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Landroid_src/mms/e/m;->a:I

    .line 1083
    iget-object v0, p0, Landroid_src/mms/e/m;->b:Landroid_src/mms/e/k;

    new-instance v1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    iput-object v1, v0, Landroid_src/mms/e/k;->a:Ljava/io/ByteArrayOutputStream;

    .line 1084
    iget-object v0, p0, Landroid_src/mms/e/m;->b:Landroid_src/mms/e/k;

    const/4 v1, 0x0

    iput v1, v0, Landroid_src/mms/e/k;->b:I

    .line 1085
    return-void
.end method

.method b()V
    .locals 4

    .prologue
    .line 1091
    iget-object v0, p0, Landroid_src/mms/e/m;->b:Landroid_src/mms/e/k;

    iget-object v0, v0, Landroid_src/mms/e/k;->a:Ljava/io/ByteArrayOutputStream;

    .line 1092
    iget-object v1, p0, Landroid_src/mms/e/m;->b:Landroid_src/mms/e/k;

    iget v1, v1, Landroid_src/mms/e/k;->b:I

    .line 1094
    iget-object v2, p0, Landroid_src/mms/e/m;->b:Landroid_src/mms/e/k;

    iget-object v3, p0, Landroid_src/mms/e/m;->c:Landroid_src/mms/e/n;

    iget-object v3, v3, Landroid_src/mms/e/n;->a:Ljava/io/ByteArrayOutputStream;

    iput-object v3, v2, Landroid_src/mms/e/k;->a:Ljava/io/ByteArrayOutputStream;

    .line 1095
    iget-object v2, p0, Landroid_src/mms/e/m;->b:Landroid_src/mms/e/k;

    iget-object v3, p0, Landroid_src/mms/e/m;->c:Landroid_src/mms/e/n;

    iget v3, v3, Landroid_src/mms/e/n;->b:I

    iput v3, v2, Landroid_src/mms/e/k;->b:I

    .line 1097
    iget-object v2, p0, Landroid_src/mms/e/m;->c:Landroid_src/mms/e/n;

    iput-object v2, p0, Landroid_src/mms/e/m;->d:Landroid_src/mms/e/n;

    .line 1100
    iget-object v2, p0, Landroid_src/mms/e/m;->c:Landroid_src/mms/e/n;

    iget-object v2, v2, Landroid_src/mms/e/n;->c:Landroid_src/mms/e/n;

    iput-object v2, p0, Landroid_src/mms/e/m;->c:Landroid_src/mms/e/n;

    .line 1101
    iget v2, p0, Landroid_src/mms/e/m;->a:I

    add-int/lit8 v2, v2, -0x1

    iput v2, p0, Landroid_src/mms/e/m;->a:I

    .line 1103
    iget-object v2, p0, Landroid_src/mms/e/m;->d:Landroid_src/mms/e/n;

    iput-object v0, v2, Landroid_src/mms/e/n;->a:Ljava/io/ByteArrayOutputStream;

    .line 1104
    iget-object v0, p0, Landroid_src/mms/e/m;->d:Landroid_src/mms/e/n;

    iput v1, v0, Landroid_src/mms/e/n;->b:I

    .line 1105
    return-void
.end method

.method c()V
    .locals 4

    .prologue
    .line 1111
    iget-object v0, p0, Landroid_src/mms/e/m;->b:Landroid_src/mms/e/k;

    iget-object v1, p0, Landroid_src/mms/e/m;->d:Landroid_src/mms/e/n;

    iget-object v1, v1, Landroid_src/mms/e/n;->a:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v1

    const/4 v2, 0x0

    iget-object v3, p0, Landroid_src/mms/e/m;->d:Landroid_src/mms/e/n;

    iget v3, v3, Landroid_src/mms/e/n;->b:I

    invoke-virtual {v0, v1, v2, v3}, Landroid_src/mms/e/k;->a([BII)V

    .line 1114
    const/4 v0, 0x0

    iput-object v0, p0, Landroid_src/mms/e/m;->d:Landroid_src/mms/e/n;

    .line 1115
    return-void
.end method

.method d()Landroid_src/mms/e/o;
    .locals 3

    .prologue
    .line 1121
    new-instance v0, Landroid_src/mms/e/o;

    iget-object v1, p0, Landroid_src/mms/e/m;->b:Landroid_src/mms/e/k;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Landroid_src/mms/e/o;-><init>(Landroid_src/mms/e/k;Landroid_src/mms/e/l;)V

    .line 1123
    iget-object v1, p0, Landroid_src/mms/e/m;->b:Landroid_src/mms/e/k;

    iget v1, v1, Landroid_src/mms/e/k;->b:I

    invoke-static {v0, v1}, Landroid_src/mms/e/o;->a(Landroid_src/mms/e/o;I)I

    .line 1124
    iget v1, p0, Landroid_src/mms/e/m;->a:I

    invoke-static {v0, v1}, Landroid_src/mms/e/o;->b(Landroid_src/mms/e/o;I)I

    .line 1126
    return-object v0
.end method
