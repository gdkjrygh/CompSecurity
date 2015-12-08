.class Lcom/google/zxing/client/android/encode/VCardContactEncoder$1;
.super Ljava/lang/Object;
.source "VCardContactEncoder.java"

# interfaces
.implements Lcom/google/zxing/client/android/encode/Formatter;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/zxing/client/android/encode/VCardContactEncoder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1
    return-void
.end method


# virtual methods
.method public format(Ljava/lang/String;)Ljava/lang/String;
    .locals 3
    .param p1, "source"    # Ljava/lang/String;

    .prologue
    .line 35
    # getter for: Lcom/google/zxing/client/android/encode/VCardContactEncoder;->NEWLINE:Ljava/util/regex/Pattern;
    invoke-static {}, Lcom/google/zxing/client/android/encode/VCardContactEncoder;->access$0()Ljava/util/regex/Pattern;

    move-result-object v0

    # getter for: Lcom/google/zxing/client/android/encode/VCardContactEncoder;->RESERVED_VCARD_CHARS:Ljava/util/regex/Pattern;
    invoke-static {}, Lcom/google/zxing/client/android/encode/VCardContactEncoder;->access$1()Ljava/util/regex/Pattern;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v1

    const-string v2, "\\\\$1"

    invoke-virtual {v1, v2}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
