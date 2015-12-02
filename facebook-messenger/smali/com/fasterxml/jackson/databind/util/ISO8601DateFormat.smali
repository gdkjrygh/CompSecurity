.class public Lcom/fasterxml/jackson/databind/util/ISO8601DateFormat;
.super Ljava/text/DateFormat;
.source "ISO8601DateFormat.java"


# static fields
.field private static CALENDAR:Ljava/util/Calendar; = null

.field private static NUMBER_FORMAT:Ljava/text/NumberFormat; = null

.field private static final serialVersionUID:J = 0x1L


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 23
    new-instance v0, Ljava/util/GregorianCalendar;

    invoke-direct {v0}, Ljava/util/GregorianCalendar;-><init>()V

    sput-object v0, Lcom/fasterxml/jackson/databind/util/ISO8601DateFormat;->CALENDAR:Ljava/util/Calendar;

    .line 24
    new-instance v0, Ljava/text/DecimalFormat;

    invoke-direct {v0}, Ljava/text/DecimalFormat;-><init>()V

    sput-object v0, Lcom/fasterxml/jackson/databind/util/ISO8601DateFormat;->NUMBER_FORMAT:Ljava/text/NumberFormat;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 26
    invoke-direct {p0}, Ljava/text/DateFormat;-><init>()V

    .line 27
    sget-object v0, Lcom/fasterxml/jackson/databind/util/ISO8601DateFormat;->NUMBER_FORMAT:Ljava/text/NumberFormat;

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/util/ISO8601DateFormat;->numberFormat:Ljava/text/NumberFormat;

    .line 28
    sget-object v0, Lcom/fasterxml/jackson/databind/util/ISO8601DateFormat;->CALENDAR:Ljava/util/Calendar;

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/util/ISO8601DateFormat;->calendar:Ljava/util/Calendar;

    .line 29
    return-void
.end method


# virtual methods
.method public clone()Ljava/lang/Object;
    .locals 0

    .prologue
    .line 50
    return-object p0
.end method

.method public format(Ljava/util/Date;Ljava/lang/StringBuffer;Ljava/text/FieldPosition;)Ljava/lang/StringBuffer;
    .locals 1

    .prologue
    .line 34
    invoke-static {p1}, Lcom/fasterxml/jackson/databind/util/ISO8601Utils;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    .line 35
    invoke-virtual {p2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 36
    return-object p2
.end method

.method public parse(Ljava/lang/String;Ljava/text/ParsePosition;)Ljava/util/Date;
    .locals 1

    .prologue
    .line 44
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p2, v0}, Ljava/text/ParsePosition;->setIndex(I)V

    .line 45
    invoke-static {p1}, Lcom/fasterxml/jackson/databind/util/ISO8601Utils;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v0

    return-object v0
.end method
