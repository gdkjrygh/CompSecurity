.class public Landroid_src/mms/f/a;
.super Ljava/lang/Object;
.source "MessageUtils.java"


# static fields
.field private static final a:[C

.field private static b:Ljava/util/HashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    .line 38
    const/16 v0, 0xb

    new-array v0, v0, [C

    fill-array-data v0, :array_0

    sput-object v0, Landroid_src/mms/f/a;->a:[C

    .line 42
    new-instance v0, Ljava/util/HashMap;

    sget-object v1, Landroid_src/mms/f/a;->a:[C

    array-length v1, v1

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    sput-object v0, Landroid_src/mms/f/a;->b:Ljava/util/HashMap;

    .line 45
    const/4 v0, 0x0

    :goto_0
    sget-object v1, Landroid_src/mms/f/a;->a:[C

    array-length v1, v1

    if-ge v0, v1, :cond_0

    .line 46
    sget-object v1, Landroid_src/mms/f/a;->b:Ljava/util/HashMap;

    sget-object v2, Landroid_src/mms/f/a;->a:[C

    aget-char v2, v2, v0

    invoke-static {v2}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v2

    sget-object v3, Landroid_src/mms/f/a;->a:[C

    aget-char v3, v3, v0

    invoke-static {v3}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 48
    :cond_0
    return-void

    .line 38
    :array_0
    .array-data 2
        0x2ds
        0x2es
        0x2cs
        0x28s
        0x29s
        0x20s
        0x2fs
        0x5cs
        0x2as
        0x23s
        0x2bs
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 67
    const-string v0, "phone"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/telephony/TelephonyManager;

    .line 69
    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getLine1Number()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 73
    if-nez p1, :cond_1

    .line 85
    :cond_0
    :goto_0
    return v0

    .line 81
    :cond_1
    const/16 v1, 0x40

    invoke-virtual {p1, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    if-gez v1, :cond_0

    .line 85
    invoke-static {p0}, Landroid_src/mms/f/a;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Landroid/telephony/PhoneNumberUtils;->compare(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    goto :goto_0
.end method

.method public static a(Ljava/lang/String;)Z
    .locals 6

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 92
    invoke-static {}, Landroid_src/mms/c;->m()Z

    move-result v0

    if-nez v0, :cond_1

    .line 112
    :cond_0
    :goto_0
    return v1

    .line 96
    :cond_1
    if-nez p0, :cond_3

    move v0, v1

    .line 98
    :goto_1
    invoke-static {}, Landroid_src/mms/c;->n()I

    move-result v3

    if-lt v0, v3, :cond_0

    invoke-static {}, Landroid_src/mms/c;->o()I

    move-result v3

    if-gt v0, v3, :cond_0

    .line 102
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-static {v3}, Ljava/lang/Character;->isLetter(C)Z

    move-result v3

    if-eqz v3, :cond_0

    move v3, v2

    .line 105
    :goto_2
    if-ge v3, v0, :cond_4

    .line 106
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v4

    .line 107
    invoke-static {v4}, Ljava/lang/Character;->isLetterOrDigit(C)Z

    move-result v5

    if-nez v5, :cond_2

    const/16 v5, 0x2e

    if-ne v4, v5, :cond_0

    .line 105
    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 96
    :cond_3
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    goto :goto_1

    :cond_4
    move v1, v2

    .line 112
    goto :goto_0
.end method

.method public static b(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 153
    invoke-static {p0}, Landroid_src/c/d;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 169
    :cond_0
    :goto_0
    return-object p0

    .line 158
    :cond_1
    invoke-static {p0}, Landroid_src/mms/f/a;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 159
    if-eqz v0, :cond_2

    move-object p0, v0

    .line 160
    goto :goto_0

    .line 164
    :cond_2
    invoke-static {p0}, Landroid_src/mms/f/a;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 169
    const/4 p0, 0x0

    goto :goto_0
.end method

.method private static c(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .prologue
    .line 121
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 122
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    .line 124
    const/4 v0, 0x0

    :goto_0
    if-ge v0, v2, :cond_3

    .line 125
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v3

    .line 128
    const/16 v4, 0x2b

    if-ne v3, v4, :cond_1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    move-result v4

    if-nez v4, :cond_1

    .line 129
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 124
    :cond_0
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 133
    :cond_1
    invoke-static {v3}, Ljava/lang/Character;->isDigit(C)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 134
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 138
    :cond_2
    sget-object v4, Landroid_src/mms/f/a;->b:Ljava/util/HashMap;

    invoke-static {v3}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_0

    .line 139
    const/4 v0, 0x0

    .line 142
    :goto_2
    return-object v0

    :cond_3
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_2
.end method
