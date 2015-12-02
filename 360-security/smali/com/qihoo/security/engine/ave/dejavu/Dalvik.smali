.class public Lcom/qihoo/security/engine/ave/dejavu/Dalvik;
.super Ljava/lang/Object;


# static fields
.field public static final MODE_CONTAIN:I = 0x2

.field public static final MODE_MATCH:I = 0x0

.field public static final MODE_REGULAR_EXPRESSION:I = 0x1


# instance fields
.field private final f:Z

.field private h:J


# direct methods
.method public constructor <init>(JJ)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v4, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/qihoo/security/engine/ave/dejavu/Dalvik;->open(JJ)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/qihoo/security/engine/ave/dejavu/Dalvik;->h:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    new-instance v0, Ljava/io/IOException;

    const-string/jumbo v1, "Parse memory 0x%08X (%d bytes) failed "

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iput-boolean v4, p0, Lcom/qihoo/security/engine/ave/dejavu/Dalvik;->f:Z

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0, p1}, Lcom/qihoo/security/engine/ave/dejavu/Dalvik;->open(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/qihoo/security/engine/ave/dejavu/Dalvik;->h:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string/jumbo v2, "Can not open "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/engine/ave/dejavu/Dalvik;->f:Z

    return-void
.end method

.method private native closeFile()V
.end method

.method private native closeMem()V
.end method


# virtual methods
.method public close()V
    .locals 1

    iget-boolean v0, p0, Lcom/qihoo/security/engine/ave/dejavu/Dalvik;->f:Z

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/qihoo/security/engine/ave/dejavu/Dalvik;->closeFile()V

    :goto_0
    return-void

    :cond_0
    invoke-direct {p0}, Lcom/qihoo/security/engine/ave/dejavu/Dalvik;->closeMem()V

    goto :goto_0
.end method

.method public find(Ljava/lang/String;I)I
    .locals 3

    const/16 v2, 0x2f

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    if-ne v0, v2, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    if-ne v0, v2, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p0, p1, p2, v0}, Lcom/qihoo/security/engine/ave/dejavu/Dalvik;->find(Ljava/lang/String;II)I

    move-result v0

    :goto_0
    return v0

    :cond_0
    invoke-virtual {p0, p1, p2, v1}, Lcom/qihoo/security/engine/ave/dejavu/Dalvik;->find(Ljava/lang/String;II)I

    move-result v0

    goto :goto_0
.end method

.method public native find(Ljava/lang/String;II)I
.end method

.method public native findAll([Ljava/lang/String;I)I
.end method

.method public native findClass(Ljava/lang/String;Ljava/lang/String;I)I
.end method

.method public native getCount(C)I
.end method

.method public native load(CI)Ljava/lang/String;
.end method

.method public native loadClass(I)Lcom/qihoo/security/engine/ave/dejavu/DalvikClass;
.end method

.method protected native open(JJ)J
.end method

.method protected native open(Ljava/lang/String;)J
.end method
