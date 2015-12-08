.class Lcom/google/zxing/client/android/encode/MECARDContactEncoder$3;
.super Ljava/lang/Object;
.source "MECARDContactEncoder.java"

# interfaces
.implements Lcom/google/zxing/client/android/encode/Formatter;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/zxing/client/android/encode/MECARDContactEncoder;->encode(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/Iterable;Ljava/lang/Iterable;Ljava/lang/Iterable;Ljava/lang/Iterable;Ljava/lang/String;)[Ljava/lang/String;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/google/zxing/client/android/encode/MECARDContactEncoder;


# direct methods
.method constructor <init>(Lcom/google/zxing/client/android/encode/MECARDContactEncoder;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/google/zxing/client/android/encode/MECARDContactEncoder$3;->this$0:Lcom/google/zxing/client/android/encode/MECARDContactEncoder;

    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public format(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p1, "source"    # Ljava/lang/String;

    .prologue
    .line 64
    invoke-static {p1}, Landroid/telephony/PhoneNumberUtils;->formatNumber(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    # invokes: Lcom/google/zxing/client/android/encode/MECARDContactEncoder;->keepOnlyDigits(Ljava/lang/CharSequence;)Ljava/lang/String;
    invoke-static {v0}, Lcom/google/zxing/client/android/encode/MECARDContactEncoder;->access$3(Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
