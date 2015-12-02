.class public Lcom/qihoo/security/appbox/bi/d;
.super Ljava/lang/Object;
.source "360Security"


# instance fields
.field public a:I

.field public b:Ljava/lang/String;

.field public c:J

.field public d:I


# direct methods
.method public constructor <init>(ZLjava/lang/String;J)V
    .locals 7

    .prologue
    .line 23
    const/4 v6, -0x1

    move-object v1, p0

    move v2, p1

    move-object v3, p2

    move-wide v4, p3

    invoke-direct/range {v1 .. v6}, Lcom/qihoo/security/appbox/bi/d;-><init>(ZLjava/lang/String;JI)V

    .line 24
    return-void
.end method

.method public constructor <init>(ZLjava/lang/String;JI)V
    .locals 1

    .prologue
    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    if-eqz p1, :cond_0

    const/4 v0, 0x1

    .line 29
    :goto_0
    iput v0, p0, Lcom/qihoo/security/appbox/bi/d;->a:I

    .line 30
    iput-object p2, p0, Lcom/qihoo/security/appbox/bi/d;->b:Ljava/lang/String;

    .line 31
    iput-wide p3, p0, Lcom/qihoo/security/appbox/bi/d;->c:J

    .line 32
    iput p5, p0, Lcom/qihoo/security/appbox/bi/d;->d:I

    .line 33
    return-void

    .line 27
    :cond_0
    const/4 v0, 0x2

    goto :goto_0
.end method


# virtual methods
.method public a()Landroid/content/ContentValues;
    .locals 6

    .prologue
    const-wide/16 v4, 0x0

    const/4 v1, 0x0

    .line 43
    iget-object v0, p0, Lcom/qihoo/security/appbox/bi/d;->b:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 65
    :cond_0
    :goto_0
    return-object v1

    .line 46
    :cond_1
    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    .line 47
    const/4 v2, 0x1

    iget v3, p0, Lcom/qihoo/security/appbox/bi/d;->a:I

    if-ne v2, v3, :cond_3

    .line 48
    const/4 v2, -0x1

    iget v3, p0, Lcom/qihoo/security/appbox/bi/d;->d:I

    if-eq v2, v3, :cond_0

    iget-wide v2, p0, Lcom/qihoo/security/appbox/bi/d;->c:J

    cmp-long v2, v4, v2

    if-eqz v2, :cond_0

    .line 52
    const-string/jumbo v2, "tp"

    iget v3, p0, Lcom/qihoo/security/appbox/bi/d;->a:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 53
    const-string/jumbo v2, "pn"

    iget-object v3, p0, Lcom/qihoo/security/appbox/bi/d;->b:Ljava/lang/String;

    invoke-virtual {v0, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    const-string/jumbo v2, "ts"

    iget-wide v4, p0, Lcom/qihoo/security/appbox/bi/d;->c:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 55
    const-string/jumbo v2, "rn"

    iget v3, p0, Lcom/qihoo/security/appbox/bi/d;->d:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 65
    :cond_2
    :goto_1
    invoke-virtual {v0}, Landroid/content/ContentValues;->size()I

    move-result v2

    if-lez v2, :cond_4

    :goto_2
    move-object v1, v0

    goto :goto_0

    .line 56
    :cond_3
    const/4 v2, 0x2

    iget v3, p0, Lcom/qihoo/security/appbox/bi/d;->a:I

    if-ne v2, v3, :cond_2

    .line 57
    iget-wide v2, p0, Lcom/qihoo/security/appbox/bi/d;->c:J

    cmp-long v2, v4, v2

    if-eqz v2, :cond_0

    .line 60
    const-string/jumbo v2, "tp"

    iget v3, p0, Lcom/qihoo/security/appbox/bi/d;->a:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 61
    const-string/jumbo v2, "pn"

    iget-object v3, p0, Lcom/qihoo/security/appbox/bi/d;->b:Ljava/lang/String;

    invoke-virtual {v0, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 62
    const-string/jumbo v2, "ts"

    iget-wide v4, p0, Lcom/qihoo/security/appbox/bi/d;->c:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    goto :goto_1

    :cond_4
    move-object v0, v1

    .line 65
    goto :goto_2
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .prologue
    .line 70
    invoke-static {}, Ljava/text/SimpleDateFormat;->getInstance()Ljava/text/DateFormat;

    move-result-object v0

    .line 71
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 72
    const-string/jumbo v2, "{mType:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    iget v2, p0, Lcom/qihoo/security/appbox/bi/d;->a:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 74
    const-string/jumbo v2, ", mPackName:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    iget-object v2, p0, Lcom/qihoo/security/appbox/bi/d;->b:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    const-string/jumbo v2, ", mTimeStamp:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    iget-wide v2, p0, Lcom/qihoo/security/appbox/bi/d;->c:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 78
    const-string/jumbo v2, "("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    iget-wide v2, p0, Lcom/qihoo/security/appbox/bi/d;->c:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/text/DateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    const-string/jumbo v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    const-string/jumbo v0, ", mLine:"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    iget v0, p0, Lcom/qihoo/security/appbox/bi/d;->d:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 83
    const-string/jumbo v0, "}"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
