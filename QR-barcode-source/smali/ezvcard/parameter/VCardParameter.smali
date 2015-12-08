.class public Lezvcard/parameter/VCardParameter;
.super Ljava/lang/Object;
.source "VCardParameter.java"


# instance fields
.field protected final value:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1
    .param p1, "value"    # Ljava/lang/String;

    .prologue
    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    if-nez p1, :cond_0

    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Lezvcard/parameter/VCardParameter;->value:Ljava/lang/String;

    .line 48
    return-void

    .line 47
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 5
    .param p1, "obj"    # Ljava/lang/Object;

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 73
    if-ne p0, p1, :cond_1

    .line 85
    :cond_0
    :goto_0
    return v1

    .line 75
    :cond_1
    if-nez p1, :cond_2

    move v1, v2

    .line 76
    goto :goto_0

    .line 77
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    if-eq v3, v4, :cond_3

    move v1, v2

    .line 78
    goto :goto_0

    :cond_3
    move-object v0, p1

    .line 79
    check-cast v0, Lezvcard/parameter/VCardParameter;

    .line 80
    .local v0, "other":Lezvcard/parameter/VCardParameter;
    iget-object v3, p0, Lezvcard/parameter/VCardParameter;->value:Ljava/lang/String;

    if-nez v3, :cond_4

    .line 81
    iget-object v3, v0, Lezvcard/parameter/VCardParameter;->value:Ljava/lang/String;

    if-eqz v3, :cond_0

    move v1, v2

    .line 82
    goto :goto_0

    .line 83
    :cond_4
    iget-object v3, p0, Lezvcard/parameter/VCardParameter;->value:Ljava/lang/String;

    iget-object v4, v0, Lezvcard/parameter/VCardParameter;->value:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    move v1, v2

    .line 84
    goto :goto_0
.end method

.method public getValue()Ljava/lang/String;
    .locals 1

    .prologue
    .line 55
    iget-object v0, p0, Lezvcard/parameter/VCardParameter;->value:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .prologue
    .line 65
    const/16 v0, 0x1f

    .line 66
    .local v0, "prime":I
    const/4 v1, 0x1

    .line 67
    .local v1, "result":I
    iget-object v2, p0, Lezvcard/parameter/VCardParameter;->value:Ljava/lang/String;

    if-nez v2, :cond_0

    const/4 v2, 0x0

    :goto_0
    add-int/lit8 v1, v2, 0x1f

    .line 68
    return v1

    .line 67
    :cond_0
    iget-object v2, p0, Lezvcard/parameter/VCardParameter;->value:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    goto :goto_0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 60
    iget-object v0, p0, Lezvcard/parameter/VCardParameter;->value:Ljava/lang/String;

    return-object v0
.end method
