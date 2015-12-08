.class public Lezvcard/io/scribe/VCardPropertyScribe$DateWriter;
.super Ljava/lang/Object;
.source "VCardPropertyScribe.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lezvcard/io/scribe/VCardPropertyScribe;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xc
    name = "DateWriter"
.end annotation


# instance fields
.field private date:Ljava/util/Date;

.field private extended:Z

.field private hasTime:Z

.field private utc:Z


# direct methods
.method public constructor <init>(Ljava/util/Date;)V
    .locals 2
    .param p1, "date"    # Ljava/util/Date;

    .prologue
    const/4 v1, 0x1

    .line 991
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 983
    iput-boolean v1, p0, Lezvcard/io/scribe/VCardPropertyScribe$DateWriter;->hasTime:Z

    .line 984
    const/4 v0, 0x0

    iput-boolean v0, p0, Lezvcard/io/scribe/VCardPropertyScribe$DateWriter;->extended:Z

    .line 985
    iput-boolean v1, p0, Lezvcard/io/scribe/VCardPropertyScribe$DateWriter;->utc:Z

    .line 992
    iput-object p1, p0, Lezvcard/io/scribe/VCardPropertyScribe$DateWriter;->date:Ljava/util/Date;

    .line 993
    return-void
.end method


# virtual methods
.method public extended(Z)Lezvcard/io/scribe/VCardPropertyScribe$DateWriter;
    .locals 0
    .param p1, "extended"    # Z

    .prologue
    .line 1013
    iput-boolean p1, p0, Lezvcard/io/scribe/VCardPropertyScribe$DateWriter;->extended:Z

    .line 1014
    return-object p0
.end method

.method public time(Z)Lezvcard/io/scribe/VCardPropertyScribe$DateWriter;
    .locals 0
    .param p1, "hasTime"    # Z

    .prologue
    .line 1002
    iput-boolean p1, p0, Lezvcard/io/scribe/VCardPropertyScribe$DateWriter;->hasTime:Z

    .line 1003
    return-object p0
.end method

.method public utc(Z)Lezvcard/io/scribe/VCardPropertyScribe$DateWriter;
    .locals 0
    .param p1, "utc"    # Z

    .prologue
    .line 1025
    iput-boolean p1, p0, Lezvcard/io/scribe/VCardPropertyScribe$DateWriter;->utc:Z

    .line 1026
    return-object p0
.end method

.method public write()Ljava/lang/String;
    .locals 2

    .prologue
    .line 1035
    iget-boolean v1, p0, Lezvcard/io/scribe/VCardPropertyScribe$DateWriter;->hasTime:Z

    if-eqz v1, :cond_3

    .line 1036
    iget-boolean v1, p0, Lezvcard/io/scribe/VCardPropertyScribe$DateWriter;->utc:Z

    if-eqz v1, :cond_1

    .line 1037
    iget-boolean v1, p0, Lezvcard/io/scribe/VCardPropertyScribe$DateWriter;->extended:Z

    if-eqz v1, :cond_0

    sget-object v0, Lezvcard/util/ISOFormat;->UTC_TIME_EXTENDED:Lezvcard/util/ISOFormat;

    .line 1045
    .local v0, "format":Lezvcard/util/ISOFormat;
    :goto_0
    iget-object v1, p0, Lezvcard/io/scribe/VCardPropertyScribe$DateWriter;->date:Ljava/util/Date;

    invoke-static {v1, v0}, Lezvcard/util/VCardDateFormatter;->format(Ljava/util/Date;Lezvcard/util/ISOFormat;)Ljava/lang/String;

    move-result-object v1

    return-object v1

    .line 1037
    .end local v0    # "format":Lezvcard/util/ISOFormat;
    :cond_0
    sget-object v0, Lezvcard/util/ISOFormat;->UTC_TIME_BASIC:Lezvcard/util/ISOFormat;

    goto :goto_0

    .line 1039
    :cond_1
    iget-boolean v1, p0, Lezvcard/io/scribe/VCardPropertyScribe$DateWriter;->extended:Z

    if-eqz v1, :cond_2

    sget-object v0, Lezvcard/util/ISOFormat;->TIME_EXTENDED:Lezvcard/util/ISOFormat;

    .restart local v0    # "format":Lezvcard/util/ISOFormat;
    :goto_1
    goto :goto_0

    .end local v0    # "format":Lezvcard/util/ISOFormat;
    :cond_2
    sget-object v0, Lezvcard/util/ISOFormat;->TIME_BASIC:Lezvcard/util/ISOFormat;

    goto :goto_1

    .line 1042
    :cond_3
    iget-boolean v1, p0, Lezvcard/io/scribe/VCardPropertyScribe$DateWriter;->extended:Z

    if-eqz v1, :cond_4

    sget-object v0, Lezvcard/util/ISOFormat;->DATE_EXTENDED:Lezvcard/util/ISOFormat;

    .restart local v0    # "format":Lezvcard/util/ISOFormat;
    :goto_2
    goto :goto_0

    .end local v0    # "format":Lezvcard/util/ISOFormat;
    :cond_4
    sget-object v0, Lezvcard/util/ISOFormat;->DATE_BASIC:Lezvcard/util/ISOFormat;

    goto :goto_2
.end method
