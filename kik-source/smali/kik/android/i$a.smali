.class final Lkik/android/i$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkik/android/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field a:Lcom/c/a/c/c;

.field final synthetic b:Lkik/android/i;

.field private final c:Landroid/database/Cursor;

.field private final d:Landroid/database/Cursor;

.field private e:Z

.field private f:Z


# direct methods
.method public constructor <init>(Lkik/android/i;Landroid/database/Cursor;Landroid/database/Cursor;Lcom/c/a/c/c;)V
    .locals 2

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 64
    iput-object p1, p0, Lkik/android/i$a;->b:Lkik/android/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 60
    iput-boolean v0, p0, Lkik/android/i$a;->e:Z

    .line 61
    iput-boolean v0, p0, Lkik/android/i$a;->f:Z

    .line 65
    iput-object p3, p0, Lkik/android/i$a;->c:Landroid/database/Cursor;

    .line 66
    iput-object p2, p0, Lkik/android/i$a;->d:Landroid/database/Cursor;

    .line 67
    iput-object p4, p0, Lkik/android/i$a;->a:Lcom/c/a/c/c;

    .line 69
    iget-object v0, p0, Lkik/android/i$a;->c:Landroid/database/Cursor;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/i$a;->c:Landroid/database/Cursor;

    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-nez v0, :cond_1

    .line 70
    :cond_0
    iput-boolean v1, p0, Lkik/android/i$a;->e:Z

    .line 72
    :cond_1
    iget-object v0, p0, Lkik/android/i$a;->d:Landroid/database/Cursor;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lkik/android/i$a;->d:Landroid/database/Cursor;

    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-nez v0, :cond_3

    .line 73
    :cond_2
    iput-boolean v1, p0, Lkik/android/i$a;->f:Z

    .line 77
    :cond_3
    iget-boolean v0, p0, Lkik/android/i$a;->e:Z

    if-nez v0, :cond_7

    .line 78
    iget-object v0, p0, Lkik/android/i$a;->c:Landroid/database/Cursor;

    const-string v1, "data1"

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    .line 80
    :cond_4
    iget-object v1, p0, Lkik/android/i$a;->c:Landroid/database/Cursor;

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 81
    if-eqz v1, :cond_5

    invoke-direct {p0, v1}, Lkik/android/i$a;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 83
    :cond_5
    iget-object v1, p0, Lkik/android/i$a;->c:Landroid/database/Cursor;

    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    .line 86
    iget-object v1, p0, Lkik/android/i$a;->c:Landroid/database/Cursor;

    invoke-interface {v1}, Landroid/database/Cursor;->isAfterLast()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 87
    :cond_6
    iget-object v0, p0, Lkik/android/i$a;->c:Landroid/database/Cursor;

    invoke-interface {v0}, Landroid/database/Cursor;->isAfterLast()Z

    move-result v0

    iput-boolean v0, p0, Lkik/android/i$a;->e:Z

    .line 89
    :cond_7
    iget-boolean v0, p0, Lkik/android/i$a;->f:Z

    if-nez v0, :cond_b

    .line 90
    iget-object v0, p0, Lkik/android/i$a;->d:Landroid/database/Cursor;

    const-string v1, "data1"

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    .line 92
    :cond_8
    iget-object v1, p0, Lkik/android/i$a;->d:Landroid/database/Cursor;

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/telephony/PhoneNumberUtils;->stripSeparators(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 93
    if-eqz v1, :cond_9

    invoke-direct {p0, v1}, Lkik/android/i$a;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_a

    .line 95
    :cond_9
    iget-object v1, p0, Lkik/android/i$a;->d:Landroid/database/Cursor;

    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    .line 98
    iget-object v1, p0, Lkik/android/i$a;->d:Landroid/database/Cursor;

    invoke-interface {v1}, Landroid/database/Cursor;->isAfterLast()Z

    move-result v1

    if-eqz v1, :cond_8

    .line 99
    :cond_a
    iget-object v0, p0, Lkik/android/i$a;->d:Landroid/database/Cursor;

    invoke-interface {v0}, Landroid/database/Cursor;->isAfterLast()Z

    move-result v0

    iput-boolean v0, p0, Lkik/android/i$a;->f:Z

    .line 101
    :cond_b
    return-void
.end method

.method private a(Ljava/lang/String;)Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 167
    if-nez p1, :cond_1

    .line 172
    :cond_0
    :goto_0
    return v0

    :cond_1
    iget-object v1, p0, Lkik/android/i$a;->a:Lcom/c/a/c/c;

    if-eqz v1, :cond_2

    iget-object v1, p0, Lkik/android/i$a;->a:Lcom/c/a/c/c;

    invoke-virtual {v1, p1}, Lcom/c/a/c/c;->b(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method protected final finalize()V
    .locals 1

    .prologue
    .line 154
    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    .line 156
    iget-object v0, p0, Lkik/android/i$a;->c:Landroid/database/Cursor;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/i$a;->c:Landroid/database/Cursor;

    invoke-interface {v0}, Landroid/database/Cursor;->isClosed()Z

    move-result v0

    if-nez v0, :cond_0

    .line 158
    iget-object v0, p0, Lkik/android/i$a;->c:Landroid/database/Cursor;

    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 160
    :cond_0
    iget-object v0, p0, Lkik/android/i$a;->d:Landroid/database/Cursor;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lkik/android/i$a;->d:Landroid/database/Cursor;

    invoke-interface {v0}, Landroid/database/Cursor;->isClosed()Z

    move-result v0

    if-nez v0, :cond_1

    .line 161
    iget-object v0, p0, Lkik/android/i$a;->d:Landroid/database/Cursor;

    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 163
    :cond_1
    return-void
.end method

.method public final hasNext()Z
    .locals 1

    .prologue
    .line 106
    iget-boolean v0, p0, Lkik/android/i$a;->e:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lkik/android/i$a;->f:Z

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final synthetic next()Ljava/lang/Object;
    .locals 5

    .prologue
    .line 55
    invoke-virtual {p0}, Lkik/android/i$a;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    const-string v1, "Trying to access items beyond the end of our size!"

    invoke-direct {v0, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    const/4 v0, 0x0

    iget-boolean v1, p0, Lkik/android/i$a;->e:Z

    if-nez v1, :cond_4

    iget-object v1, p0, Lkik/android/i$a;->c:Landroid/database/Cursor;

    const-string v2, "data1"

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    :cond_1
    iget-object v2, p0, Lkik/android/i$a;->c:Landroid/database/Cursor;

    invoke-interface {v2, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-direct {p0, v2}, Lkik/android/i$a;->a(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_2

    new-instance v0, Lkik/a/d/b;

    sget v3, Lkik/a/d/b$a;->b:I

    sget v4, Lkik/a/d/b$b;->a:I

    invoke-direct {v0, v3, v2, v4}, Lkik/a/d/b;-><init>(ILjava/lang/String;I)V

    :cond_2
    iget-object v2, p0, Lkik/android/i$a;->c:Landroid/database/Cursor;

    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    if-nez v0, :cond_3

    iget-object v2, p0, Lkik/android/i$a;->c:Landroid/database/Cursor;

    invoke-interface {v2}, Landroid/database/Cursor;->isAfterLast()Z

    move-result v2

    if-eqz v2, :cond_1

    :cond_3
    iget-object v1, p0, Lkik/android/i$a;->c:Landroid/database/Cursor;

    invoke-interface {v1}, Landroid/database/Cursor;->isAfterLast()Z

    move-result v1

    iput-boolean v1, p0, Lkik/android/i$a;->e:Z

    :cond_4
    iget-boolean v1, p0, Lkik/android/i$a;->f:Z

    if-nez v1, :cond_8

    if-nez v0, :cond_8

    iget-object v1, p0, Lkik/android/i$a;->d:Landroid/database/Cursor;

    const-string v2, "data1"

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    :cond_5
    iget-object v2, p0, Lkik/android/i$a;->d:Landroid/database/Cursor;

    invoke-interface {v2, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/telephony/PhoneNumberUtils;->stripSeparators(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_6

    invoke-direct {p0, v2}, Lkik/android/i$a;->a(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_6

    new-instance v0, Lkik/a/d/b;

    sget v3, Lkik/a/d/b$a;->a:I

    sget v4, Lkik/a/d/b$b;->a:I

    invoke-direct {v0, v3, v2, v4}, Lkik/a/d/b;-><init>(ILjava/lang/String;I)V

    :cond_6
    iget-object v2, p0, Lkik/android/i$a;->d:Landroid/database/Cursor;

    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    if-nez v0, :cond_7

    iget-object v2, p0, Lkik/android/i$a;->d:Landroid/database/Cursor;

    invoke-interface {v2}, Landroid/database/Cursor;->isAfterLast()Z

    move-result v2

    if-eqz v2, :cond_5

    :cond_7
    iget-object v1, p0, Lkik/android/i$a;->d:Landroid/database/Cursor;

    invoke-interface {v1}, Landroid/database/Cursor;->isAfterLast()Z

    move-result v1

    iput-boolean v1, p0, Lkik/android/i$a;->f:Z

    :cond_8
    iget-boolean v1, p0, Lkik/android/i$a;->e:Z

    if-eqz v1, :cond_9

    iget-object v1, p0, Lkik/android/i$a;->c:Landroid/database/Cursor;

    invoke-interface {v1}, Landroid/database/Cursor;->isClosed()Z

    move-result v1

    if-nez v1, :cond_9

    iget-object v1, p0, Lkik/android/i$a;->c:Landroid/database/Cursor;

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    :cond_9
    iget-boolean v1, p0, Lkik/android/i$a;->f:Z

    if-eqz v1, :cond_a

    iget-object v1, p0, Lkik/android/i$a;->d:Landroid/database/Cursor;

    invoke-interface {v1}, Landroid/database/Cursor;->isClosed()Z

    move-result v1

    if-nez v1, :cond_a

    iget-object v1, p0, Lkik/android/i$a;->d:Landroid/database/Cursor;

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    :cond_a
    return-object v0
.end method

.method public final remove()V
    .locals 1

    .prologue
    .line 179
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method
