.class public final Lkik/android/util/bk;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/android/util/bk$a;
    }
.end annotation


# instance fields
.field private a:Ljava/util/regex/Pattern;

.field private b:Ljava/lang/StringBuilder;

.field private c:Ljava/util/Hashtable;


# direct methods
.method public constructor <init>()V
    .locals 4

    .prologue
    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v0, p0, Lkik/android/util/bk;->b:Ljava/lang/StringBuilder;

    .line 52
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    iput-object v0, p0, Lkik/android/util/bk;->c:Ljava/util/Hashtable;

    .line 54
    const-string v0, ":)"

    const-string v1, "\ue056"

    const-string v2, ""

    const-string v3, ""

    invoke-direct {p0, v0, v1, v2, v3}, Lkik/android/util/bk;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    const-string v0, ";)"

    const-string v1, "\ue405"

    const-string v2, ""

    const-string v3, ""

    invoke-direct {p0, v0, v1, v2, v3}, Lkik/android/util/bk;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    const-string v0, ":D"

    const-string v1, "\ue057"

    const-string v2, ""

    const-string v3, "A-Za-z0-9"

    invoke-direct {p0, v0, v1, v2, v3}, Lkik/android/util/bk;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    const-string v0, ":P"

    const-string v1, "\ue105"

    const-string v2, ""

    const-string v3, "A-Za-z0-9"

    invoke-direct {p0, v0, v1, v2, v3}, Lkik/android/util/bk;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    const-string v0, ":|"

    const-string v1, "\ue40e"

    const-string v2, ""

    const-string v3, ""

    invoke-direct {p0, v0, v1, v2, v3}, Lkik/android/util/bk;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    const-string v0, ":/"

    const-string v1, "\ue40b"

    const-string v2, ""

    const-string v3, "/"

    invoke-direct {p0, v0, v1, v2, v3}, Lkik/android/util/bk;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    const-string v0, ">:("

    const-string v1, "\ue416"

    const-string v2, ""

    const-string v3, ""

    invoke-direct {p0, v0, v1, v2, v3}, Lkik/android/util/bk;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 61
    const-string v0, ":("

    const-string v1, "\ue403"

    const-string v2, ""

    const-string v3, ""

    invoke-direct {p0, v0, v1, v2, v3}, Lkik/android/util/bk;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 62
    const-string v0, ":X"

    const-string v1, "\ue406"

    const-string v2, ""

    const-string v3, "A-Za-z0-9"

    invoke-direct {p0, v0, v1, v2, v3}, Lkik/android/util/bk;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 63
    const-string v0, "<3"

    const-string v1, "\ue328"

    const-string v2, ""

    const-string v3, ""

    invoke-direct {p0, v0, v1, v2, v3}, Lkik/android/util/bk;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    const-string v0, "</3"

    const-string v1, "\ue023"

    const-string v2, ""

    const-string v3, ""

    invoke-direct {p0, v0, v1, v2, v3}, Lkik/android/util/bk;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 65
    const-string v0, "B)"

    const-string v1, "\ue402"

    const-string v2, "A-Za-z0-9"

    const-string v3, ""

    invoke-direct {p0, v0, v1, v2, v3}, Lkik/android/util/bk;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 66
    const-string v0, ":3"

    const-string v1, "\ue04f"

    const-string v2, "0-9"

    const-string v3, "0-9"

    invoke-direct {p0, v0, v1, v2, v3}, Lkik/android/util/bk;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    const-string v0, ":\'("

    const-string v1, "\ue413"

    const-string v2, ""

    const-string v3, ""

    invoke-direct {p0, v0, v1, v2, v3}, Lkik/android/util/bk;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 68
    const-string v0, ":O"

    const-string v1, "\ue410"

    const-string v2, ""

    const-string v3, "A-Za-z0-9"

    invoke-direct {p0, v0, v1, v2, v3}, Lkik/android/util/bk;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 69
    const-string v0, ":S"

    const-string v1, "\ue411"

    const-string v2, ""

    const-string v3, "A-Za-z0-9"

    invoke-direct {p0, v0, v1, v2, v3}, Lkik/android/util/bk;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 70
    const-string v0, ":$"

    const-string v1, "\ue40d"

    const-string v2, ""

    const-string v3, "0-9"

    invoke-direct {p0, v0, v1, v2, v3}, Lkik/android/util/bk;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 71
    const-string v0, ":*"

    const-string v1, "\ue418"

    const-string v2, ""

    const-string v3, ""

    invoke-direct {p0, v0, v1, v2, v3}, Lkik/android/util/bk;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 72
    const-string v0, "(KIK)"

    const-string v1, "\ue21a"

    const-string v2, ""

    const-string v3, ""

    invoke-direct {p0, v0, v1, v2, v3}, Lkik/android/util/bk;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    const-string v0, ":E"

    const-string v1, "\ue404"

    const-string v2, ""

    const-string v3, "A-Za-z0-9"

    invoke-direct {p0, v0, v1, v2, v3}, Lkik/android/util/bk;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 74
    const-string v0, "D:"

    const-string v1, "\ue415"

    const-string v2, "A-Za-z0-9"

    const-string v3, ""

    invoke-direct {p0, v0, v1, v2, v3}, Lkik/android/util/bk;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 75
    const-string v0, ">:)"

    const-string v1, ""

    const-string v2, ""

    const-string v3, ""

    invoke-direct {p0, v0, v1, v2, v3}, Lkik/android/util/bk;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 78
    const-string v0, ":p"

    const-string v1, ":P"

    invoke-direct {p0, v1}, Lkik/android/util/bk;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, ""

    const-string v3, "A-Za-z0-9"

    invoke-direct {p0, v0, v1, v2, v3}, Lkik/android/util/bk;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    const-string v0, ":s"

    const-string v1, ":S"

    invoke-direct {p0, v1}, Lkik/android/util/bk;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, ""

    const-string v3, "A-Za-z0-9"

    invoke-direct {p0, v0, v1, v2, v3}, Lkik/android/util/bk;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 80
    const-string v0, ":o"

    const-string v1, ":O"

    invoke-direct {p0, v1}, Lkik/android/util/bk;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, ""

    const-string v3, "A-Za-z0-9"

    invoke-direct {p0, v0, v1, v2, v3}, Lkik/android/util/bk;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 81
    const-string v0, ":x"

    const-string v1, ":X"

    invoke-direct {p0, v1}, Lkik/android/util/bk;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, ""

    const-string v3, "A-Za-z0-9"

    invoke-direct {p0, v0, v1, v2, v3}, Lkik/android/util/bk;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    return-void
.end method

.method private a(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 86
    iget-object v0, p0, Lkik/android/util/bk;->c:Ljava/util/Hashtable;

    invoke-virtual {v0, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method private a(Ljava/lang/CharSequence;I)Lkik/android/util/bk$a;
    .locals 4

    .prologue
    .line 160
    iget-object v0, p0, Lkik/android/util/bk;->a:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v2

    .line 163
    invoke-virtual {v2, p2}, Ljava/util/regex/Matcher;->find(I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 164
    const/4 v0, 0x0

    .line 177
    :goto_0
    return-object v0

    .line 168
    :cond_0
    invoke-virtual {v2}, Ljava/util/regex/Matcher;->groupCount()I

    move-result v3

    .line 169
    const/4 v0, 0x1

    move v1, v0

    .line 171
    :goto_1
    if-gt v1, v3, :cond_1

    .line 172
    invoke-virtual {v2, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    .line 173
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    .line 177
    :cond_1
    new-instance v0, Lkik/android/util/bk$a;

    invoke-virtual {v2, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v1}, Ljava/util/regex/Matcher;->start(I)I

    move-result v1

    invoke-direct {v0, v3, v1}, Lkik/android/util/bk$a;-><init>(Ljava/lang/String;I)V

    goto :goto_0
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .prologue
    const/16 v2, 0x29

    .line 98
    iget-object v0, p0, Lkik/android/util/bk;->c:Ljava/util/Hashtable;

    invoke-virtual {v0, p1, p2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    iget-object v0, p0, Lkik/android/util/bk;->b:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 104
    iget-object v0, p0, Lkik/android/util/bk;->b:Ljava/lang/StringBuilder;

    const/16 v1, 0x7c

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 107
    :cond_0
    iget-object v0, p0, Lkik/android/util/bk;->b:Ljava/lang/StringBuilder;

    const-string v1, "(?:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_1

    .line 111
    iget-object v0, p0, Lkik/android/util/bk;->b:Ljava/lang/StringBuilder;

    const-string v1, "(?:^|[^"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "])"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    :cond_1
    iget-object v0, p0, Lkik/android/util/bk;->b:Ljava/lang/StringBuilder;

    const/16 v1, 0x28

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 116
    iget-object v0, p0, Lkik/android/util/bk;->b:Ljava/lang/StringBuilder;

    invoke-static {p1}, Ljava/util/regex/Pattern;->quote(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    iget-object v0, p0, Lkik/android/util/bk;->b:Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 120
    invoke-virtual {p4}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_2

    .line 121
    iget-object v0, p0, Lkik/android/util/bk;->b:Ljava/lang/StringBuilder;

    const-string v1, "(?:[^"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]|$)"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    :cond_2
    iget-object v0, p0, Lkik/android/util/bk;->b:Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 126
    iget-object v0, p0, Lkik/android/util/bk;->b:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    iput-object v0, p0, Lkik/android/util/bk;->a:Ljava/util/regex/Pattern;

    .line 127
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/CharSequence;)[Lkik/android/util/bk$a;
    .locals 2

    .prologue
    .line 225
    new-instance v1, Ljava/util/Vector;

    invoke-direct {v1}, Ljava/util/Vector;-><init>()V

    .line 226
    const/4 v0, 0x0

    .line 231
    :goto_0
    invoke-direct {p0, p1, v0}, Lkik/android/util/bk;->a(Ljava/lang/CharSequence;I)Lkik/android/util/bk$a;

    move-result-object v0

    .line 233
    if-eqz v0, :cond_0

    .line 234
    invoke-virtual {v1, v0}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    .line 240
    invoke-virtual {v0}, Lkik/android/util/bk$a;->b()I

    move-result v0

    goto :goto_0

    .line 244
    :cond_0
    invoke-virtual {v1}, Ljava/util/Vector;->size()I

    move-result v0

    new-array v0, v0, [Lkik/android/util/bk$a;

    .line 246
    invoke-virtual {v1, v0}, Ljava/util/Vector;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 248
    return-object v0
.end method
