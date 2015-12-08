.class public final Lkik/a/h/o;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a([B[B[B)Lcom/kik/n/a/e/a;
    .locals 3

    .prologue
    .line 94
    const/4 v0, 0x0

    .line 97
    if-eqz p0, :cond_0

    .line 99
    new-instance v0, Lcom/kik/n/a/e/a;

    invoke-direct {v0}, Lcom/kik/n/a/e/a;-><init>()V

    .line 101
    :try_start_0
    invoke-static {p0, p1}, Lkik/a/h/h;->b([B[B)[B
    :try_end_0
    .catch Ljava/security/InvalidKeyException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v1

    .line 113
    invoke-static {p1}, Lkik/a/h/o;->a([B)[B

    move-result-object v2

    invoke-static {v2}, Lcom/b/a/b;->b([B)Lcom/b/a/b;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/kik/n/a/e/a;->a(Lcom/b/a/b;)Lcom/kik/n/a/e/a;

    .line 114
    invoke-static {p2}, Lcom/b/a/b;->b([B)Lcom/b/a/b;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/kik/n/a/e/a;->b(Lcom/b/a/b;)Lcom/kik/n/a/e/a;

    .line 115
    invoke-static {v1}, Lcom/b/a/b;->b([B)Lcom/b/a/b;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kik/n/a/e/a;->d(Lcom/b/a/b;)Lcom/kik/n/a/e/a;

    .line 117
    invoke-static {p0, p1, p2}, Lkik/a/h/h;->a([B[B[B)[B

    move-result-object v1

    .line 123
    if-eqz v1, :cond_0

    .line 124
    invoke-static {v1}, Lcom/b/a/b;->b([B)Lcom/b/a/b;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kik/n/a/e/a;->c(Lcom/b/a/b;)Lcom/kik/n/a/e/a;

    .line 128
    :cond_0
    return-object v0

    .line 106
    :catch_0
    move-exception v0

    .line 107
    new-instance v1, Lkik/a/f/g;

    invoke-direct {v1, v0}, Lkik/a/f/g;-><init>(Ljava/lang/Exception;)V

    throw v1

    .line 109
    :catch_1
    move-exception v0

    .line 110
    new-instance v1, Lkik/a/f/g;

    invoke-direct {v1, v0}, Lkik/a/f/g;-><init>(Ljava/lang/Exception;)V

    throw v1
.end method

.method public static a(Lcom/b/a/n;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 133
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 135
    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Lkik/a/h/o;->a(Lcom/b/a/n;Ljava/lang/StringBuilder;I)V

    .line 137
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static a(Lcom/b/a/n;Ljava/lang/StringBuilder;I)V
    .locals 9

    .prologue
    const/4 v0, 0x0

    .line 142
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    .line 143
    const-string v1, ""

    move-object v2, v1

    move v1, v0

    .line 145
    :goto_0
    if-ge v1, p2, :cond_0

    .line 146
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/16 v4, 0x20

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 145
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 149
    :cond_0
    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    .line 151
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const/16 v2, 0x3a

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v1

    const/16 v2, 0xa

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 153
    invoke-virtual {v3}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v2

    array-length v4, v2

    move v1, v0

    :goto_1
    if-ge v1, v4, :cond_2

    aget-object v5, v2, v1

    .line 154
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v6

    .line 155
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 156
    const/4 v0, 0x0

    .line 157
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v7

    .line 159
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v8

    invoke-virtual {v8, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1

    invoke-static {v7}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v8

    if-nez v8, :cond_1

    invoke-static {v7}, Ljava/lang/reflect/Modifier;->isPrivate(I)Z

    move-result v7

    if-nez v7, :cond_1

    .line 163
    const/4 v7, 0x1

    invoke-virtual {v5, v7}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 169
    :try_start_0
    invoke-virtual {v5, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 174
    :goto_2
    invoke-static {v6, v0, p1, p2}, Lkik/a/h/o;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/StringBuilder;I)V

    .line 153
    :cond_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    :catch_0
    move-exception v5

    goto :goto_2

    .line 176
    :cond_2
    return-void
.end method

.method private static a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/StringBuilder;I)V
    .locals 6

    .prologue
    const/16 v5, 0x22

    const/4 v0, 0x0

    const/16 v4, 0xa

    .line 180
    const-string v1, ""

    move-object v2, v1

    move v1, v0

    .line 182
    :goto_0
    if-ge v1, p3, :cond_0

    .line 183
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/16 v3, 0x20

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 182
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 185
    :cond_0
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    if-nez p1, :cond_2

    .line 188
    const-string v0, "(null)\n"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 217
    :cond_1
    :goto_1
    return-void

    .line 190
    :cond_2
    instance-of v1, p1, Ljava/lang/String;

    if-eqz v1, :cond_3

    .line 191
    invoke-virtual {p2, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 193
    :cond_3
    instance-of v1, p1, Ljava/lang/Number;

    if-eqz v1, :cond_4

    .line 194
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 196
    :cond_4
    instance-of v1, p1, Lcom/b/a/b;

    if-eqz v1, :cond_5

    .line 197
    check-cast p1, Lcom/b/a/b;

    .line 198
    invoke-virtual {p1}, Lcom/b/a/b;->c()[B

    move-result-object v0

    invoke-static {v0}, Lkik/a/h/i;->a([B)Ljava/lang/String;

    move-result-object v0

    .line 200
    const/16 v1, 0x5b

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/b/a/b;->b()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "] "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 202
    :cond_5
    instance-of v1, p1, Ljava/util/Collection;

    if-eqz v1, :cond_6

    .line 205
    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 207
    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 208
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    add-int/lit8 v4, p3, 0x2

    invoke-static {v3, v2, p2, v4}, Lkik/a/h/o;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/StringBuilder;I)V

    .line 209
    add-int/lit8 v0, v0, 0x1

    .line 210
    goto :goto_2

    .line 212
    :cond_6
    instance-of v0, p1, Lcom/b/a/n;

    if-eqz v0, :cond_1

    .line 213
    const/16 v0, 0x28

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 215
    check-cast p1, Lcom/b/a/n;

    add-int/lit8 v0, p3, 0x2

    invoke-static {p1, p2, v0}, Lkik/a/h/o;->a(Lcom/b/a/n;Ljava/lang/StringBuilder;I)V

    goto/16 :goto_1
.end method

.method public static a(Lcom/kik/n/a/e/a;[B)[B
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 50
    if-eqz p0, :cond_0

    if-nez p1, :cond_2

    :cond_0
    move-object v0, v1

    .line 89
    :cond_1
    return-object v0

    .line 54
    :cond_2
    invoke-virtual {p0}, Lcom/kik/n/a/e/a;->d()Lcom/b/a/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/b/a/b;->c()[B

    move-result-object v0

    .line 55
    invoke-virtual {p0}, Lcom/kik/n/a/e/a;->c()Lcom/b/a/b;

    move-result-object v2

    invoke-virtual {v2}, Lcom/b/a/b;->c()[B

    move-result-object v2

    .line 56
    invoke-static {v0, p1, v2}, Lkik/a/h/h;->b([B[B[B)[B

    move-result-object v0

    .line 62
    invoke-virtual {p0}, Lcom/kik/n/a/e/a;->e()Lcom/b/a/b;

    move-result-object v2

    .line 66
    if-eqz v2, :cond_3

    .line 67
    invoke-virtual {v2}, Lcom/b/a/b;->c()[B

    move-result-object v1

    .line 70
    :cond_3
    if-eqz v1, :cond_1

    .line 75
    :try_start_0
    invoke-static {v0, p1}, Lkik/a/h/h;->b([B[B)[B
    :try_end_0
    .catch Ljava/security/InvalidKeyException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v2

    .line 84
    invoke-static {v1, v2}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v1

    if-nez v1, :cond_1

    .line 85
    new-instance v0, Lkik/a/f/g;

    const-string v1, "XData MAC mismatch"

    invoke-direct {v0, v1}, Lkik/a/f/g;-><init>(Ljava/lang/String;)V

    throw v0

    .line 77
    :catch_0
    move-exception v0

    .line 78
    new-instance v1, Lkik/a/f/g;

    invoke-direct {v1, v0}, Lkik/a/f/g;-><init>(Ljava/lang/Exception;)V

    throw v1

    .line 80
    :catch_1
    move-exception v0

    .line 81
    new-instance v1, Lkik/a/f/g;

    invoke-direct {v1, v0}, Lkik/a/f/g;-><init>(Ljava/lang/Exception;)V

    throw v1
.end method

.method private static a([B)[B
    .locals 2

    .prologue
    .line 35
    const/4 v0, 0x0

    .line 38
    :try_start_0
    const-string v1, "SHA-256"

    invoke-static {v1}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v1

    .line 40
    invoke-virtual {v1, p0}, Ljava/security/MessageDigest;->digest([B)[B
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 45
    :goto_0
    return-object v0

    :catch_0
    move-exception v1

    goto :goto_0
.end method
