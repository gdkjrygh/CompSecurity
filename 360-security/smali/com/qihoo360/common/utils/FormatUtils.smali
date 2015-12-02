.class public Lcom/qihoo360/common/utils/FormatUtils;
.super Ljava/lang/Object;
.source "360Security"


# static fields
.field public static final FORMAT_SHOW_DATE_NO_YEAR:Ljava/lang/String; = "dd/MM HH:mm"

.field public static final FORMAT_SHOW_YEAR:Ljava/lang/String; = "yyyy"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getFormatedTime(J)Ljava/lang/String;
    .locals 2

    .prologue
    .line 17
    invoke-static {p0, p1}, Landroid/text/format/DateUtils;->isToday(J)Z

    move-result v0

    .line 18
    if-eqz v0, :cond_0

    const-string/jumbo v0, "HH:mm"

    .line 19
    :goto_0
    invoke-static {p0, p1, v0}, Lcom/qihoo360/common/utils/FormatUtils;->getFormatedTime(JLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 18
    :cond_0
    const-string/jumbo v0, "dd/MM/yyyy"

    goto :goto_0
.end method

.method public static getFormatedTime(JLjava/lang/String;)Ljava/lang/String;
    .locals 4

    .prologue
    .line 25
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0, p0, p1}, Ljava/util/Date;-><init>(J)V

    .line 26
    new-instance v1, Ljava/text/SimpleDateFormat;

    invoke-direct {v1, p2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 27
    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    .line 28
    invoke-virtual {v1, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 29
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
