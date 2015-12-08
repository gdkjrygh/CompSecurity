.class public final Lcom/kik/android/c/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kik/android/c/f$d;,
        Lcom/kik/android/c/f$b;,
        Lcom/kik/android/c/f$c;,
        Lcom/kik/android/c/f$e;,
        Lcom/kik/android/c/f$a;
    }
.end annotation


# static fields
.field private static final a:Ljava/util/HashMap;

.field private static final b:Ljava/util/HashMap;

.field private static final c:Ljava/util/List;

.field private static final d:Ljava/util/List;

.field private static e:Lcom/android/volley/p;

.field private static f:Lcom/android/volley/toolbox/d;

.field private static g:Lcom/kik/cache/SimpleLruBitmapCache;

.field private static h:Lcom/kik/cache/ad;

.field private static j:Ljava/util/List;

.field private static final m:Ljava/util/Comparator;

.field private static final n:Lorg/c/b;

.field private static p:Ljava/io/File;

.field private static q:Lcom/kik/g/k;


# instance fields
.field private final i:Lcom/kik/android/c/l;

.field private final k:Lkik/a/e/w;

.field private final l:Lkik/a/e/t;

.field private final o:Lcom/kik/g/f;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .prologue
    .line 89
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/kik/android/c/f;->a:Ljava/util/HashMap;

    .line 90
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/kik/android/c/f;->b:Ljava/util/HashMap;

    .line 91
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/kik/android/c/f;->c:Ljava/util/List;

    .line 92
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/kik/android/c/f;->d:Ljava/util/List;

    .line 98
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/kik/android/c/f;->j:Ljava/util/List;

    .line 102
    new-instance v0, Lcom/kik/android/c/f$e;

    invoke-direct {v0}, Lcom/kik/android/c/f$e;-><init>()V

    sput-object v0, Lcom/kik/android/c/f;->m:Ljava/util/Comparator;

    .line 104
    const-string v0, "SmileyManager"

    invoke-static {v0}, Lorg/c/c;->a(Ljava/lang/String;)Lorg/c/b;

    move-result-object v0

    sput-object v0, Lcom/kik/android/c/f;->n:Lorg/c/b;

    .line 224
    sget-object v0, Lcom/kik/android/c/f;->j:Ljava/util/List;

    const-string v1, ":)"

    const v2, 0x7f02027f

    invoke-static {v1, v2}, Lcom/kik/android/c/c;->a(Ljava/lang/String;I)Lcom/kik/android/c/c;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 225
    sget-object v0, Lcom/kik/android/c/f;->j:Ljava/util/List;

    const-string v1, ";)"

    const v2, 0x7f0202a8

    invoke-static {v1, v2}, Lcom/kik/android/c/c;->a(Ljava/lang/String;I)Lcom/kik/android/c/c;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 226
    sget-object v0, Lcom/kik/android/c/f;->j:Ljava/util/List;

    const-string v1, ":("

    const v2, 0x7f020289

    invoke-static {v1, v2}, Lcom/kik/android/c/c;->a(Ljava/lang/String;I)Lcom/kik/android/c/c;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 227
    sget-object v0, Lcom/kik/android/c/f;->j:Ljava/util/List;

    const-string v1, ":D"

    const v2, 0x7f020281

    invoke-static {v1, v2}, Lcom/kik/android/c/c;->a(Ljava/lang/String;I)Lcom/kik/android/c/c;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 228
    sget-object v0, Lcom/kik/android/c/f;->j:Ljava/util/List;

    const-string v1, ":P"

    const v2, 0x7f02028b

    invoke-static {v1, v2}, Lcom/kik/android/c/c;->a(Ljava/lang/String;I)Lcom/kik/android/c/c;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 229
    sget-object v0, Lcom/kik/android/c/f;->j:Ljava/util/List;

    const-string v1, ":|"

    const v2, 0x7f02028d

    invoke-static {v1, v2}, Lcom/kik/android/c/c;->a(Ljava/lang/String;I)Lcom/kik/android/c/c;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 230
    sget-object v0, Lcom/kik/android/c/f;->j:Ljava/util/List;

    const-string v1, ":/"

    const v2, 0x7f020291

    invoke-static {v1, v2}, Lcom/kik/android/c/c;->a(Ljava/lang/String;I)Lcom/kik/android/c/c;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 231
    sget-object v0, Lcom/kik/android/c/f;->j:Ljava/util/List;

    const-string v1, ">:("

    const v2, 0x7f02029e

    invoke-static {v1, v2}, Lcom/kik/android/c/c;->a(Ljava/lang/String;I)Lcom/kik/android/c/c;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 232
    sget-object v0, Lcom/kik/android/c/f;->j:Ljava/util/List;

    const-string v1, ":X"

    const v2, 0x7f020297

    invoke-static {v1, v2}, Lcom/kik/android/c/c;->a(Ljava/lang/String;I)Lcom/kik/android/c/c;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 233
    sget-object v0, Lcom/kik/android/c/f;->j:Ljava/util/List;

    const-string v1, "<3"

    const v2, 0x7f0202a5

    invoke-static {v1, v2}, Lcom/kik/android/c/c;->a(Ljava/lang/String;I)Lcom/kik/android/c/c;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 234
    sget-object v0, Lcom/kik/android/c/f;->j:Ljava/util/List;

    const-string v1, "</3"

    const v2, 0x7f0202a3

    invoke-static {v1, v2}, Lcom/kik/android/c/c;->a(Ljava/lang/String;I)Lcom/kik/android/c/c;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 235
    sget-object v0, Lcom/kik/android/c/f;->j:Ljava/util/List;

    const-string v1, "B)"

    const v2, 0x7f02027a

    invoke-static {v1, v2}, Lcom/kik/android/c/c;->a(Ljava/lang/String;I)Lcom/kik/android/c/c;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 236
    sget-object v0, Lcom/kik/android/c/f;->j:Ljava/util/List;

    const-string v1, ":3"

    const v2, 0x7f020295

    invoke-static {v1, v2}, Lcom/kik/android/c/c;->a(Ljava/lang/String;I)Lcom/kik/android/c/c;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 237
    sget-object v0, Lcom/kik/android/c/f;->j:Ljava/util/List;

    const-string v1, ":\'("

    const v2, 0x7f02027d

    invoke-static {v1, v2}, Lcom/kik/android/c/c;->a(Ljava/lang/String;I)Lcom/kik/android/c/c;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 238
    sget-object v0, Lcom/kik/android/c/f;->j:Ljava/util/List;

    const-string v1, ":O"

    const v2, 0x7f020287

    invoke-static {v1, v2}, Lcom/kik/android/c/c;->a(Ljava/lang/String;I)Lcom/kik/android/c/c;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 239
    sget-object v0, Lcom/kik/android/c/f;->j:Ljava/util/List;

    const-string v1, ":S"

    const v2, 0x7f02028f

    invoke-static {v1, v2}, Lcom/kik/android/c/c;->a(Ljava/lang/String;I)Lcom/kik/android/c/c;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 240
    sget-object v0, Lcom/kik/android/c/f;->j:Ljava/util/List;

    const-string v1, ":$"

    const v2, 0x7f020283

    invoke-static {v1, v2}, Lcom/kik/android/c/c;->a(Ljava/lang/String;I)Lcom/kik/android/c/c;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 241
    sget-object v0, Lcom/kik/android/c/f;->j:Ljava/util/List;

    const-string v1, ":*"

    const v2, 0x7f020293

    invoke-static {v1, v2}, Lcom/kik/android/c/c;->a(Ljava/lang/String;I)Lcom/kik/android/c/c;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 242
    sget-object v0, Lcom/kik/android/c/f;->j:Ljava/util/List;

    const-string v1, ">:)"

    const v2, 0x7f02029c

    invoke-static {v1, v2}, Lcom/kik/android/c/c;->a(Ljava/lang/String;I)Lcom/kik/android/c/c;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 243
    sget-object v0, Lcom/kik/android/c/f;->j:Ljava/util/List;

    const-string v1, ":E"

    const v2, 0x7f020285

    invoke-static {v1, v2}, Lcom/kik/android/c/c;->a(Ljava/lang/String;I)Lcom/kik/android/c/c;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 244
    sget-object v0, Lcom/kik/android/c/f;->j:Ljava/util/List;

    const-string v1, "(KIK)"

    const v2, 0x7f0202a1

    invoke-static {v1, v2}, Lcom/kik/android/c/c;->a(Ljava/lang/String;I)Lcom/kik/android/c/c;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 245
    sget-object v0, Lcom/kik/android/c/f;->j:Ljava/util/List;

    const-string v1, "D:"

    const v2, 0x7f020299

    invoke-static {v1, v2}, Lcom/kik/android/c/c;->a(Ljava/lang/String;I)Lcom/kik/android/c/c;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 248
    sget-object v0, Lcom/kik/android/c/f;->b:Ljava/util/HashMap;

    const-string v1, ":)"

    const v2, 0x7f020280

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 249
    sget-object v0, Lcom/kik/android/c/f;->b:Ljava/util/HashMap;

    const-string v1, ";)"

    const v2, 0x7f0202a9

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 250
    sget-object v0, Lcom/kik/android/c/f;->b:Ljava/util/HashMap;

    const-string v1, ":("

    const v2, 0x7f02028a

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 251
    sget-object v0, Lcom/kik/android/c/f;->b:Ljava/util/HashMap;

    const-string v1, ":D"

    const v2, 0x7f020282

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 252
    sget-object v0, Lcom/kik/android/c/f;->b:Ljava/util/HashMap;

    const-string v1, ":P"

    const v2, 0x7f02028c

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 253
    sget-object v0, Lcom/kik/android/c/f;->b:Ljava/util/HashMap;

    const-string v1, ":|"

    const v2, 0x7f02028e

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 254
    sget-object v0, Lcom/kik/android/c/f;->b:Ljava/util/HashMap;

    const-string v1, ":/"

    const v2, 0x7f020292

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 255
    sget-object v0, Lcom/kik/android/c/f;->b:Ljava/util/HashMap;

    const-string v1, ">:("

    const v2, 0x7f02029f

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 256
    sget-object v0, Lcom/kik/android/c/f;->b:Ljava/util/HashMap;

    const-string v1, ":X"

    const v2, 0x7f020298

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 257
    sget-object v0, Lcom/kik/android/c/f;->b:Ljava/util/HashMap;

    const-string v1, "<3"

    const v2, 0x7f0202a6

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 258
    sget-object v0, Lcom/kik/android/c/f;->b:Ljava/util/HashMap;

    const-string v1, "</3"

    const v2, 0x7f0202a4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 259
    sget-object v0, Lcom/kik/android/c/f;->b:Ljava/util/HashMap;

    const-string v1, "B)"

    const v2, 0x7f02027b

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 260
    sget-object v0, Lcom/kik/android/c/f;->b:Ljava/util/HashMap;

    const-string v1, ":3"

    const v2, 0x7f020296

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 261
    sget-object v0, Lcom/kik/android/c/f;->b:Ljava/util/HashMap;

    const-string v1, ":\'("

    const v2, 0x7f02027e

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 262
    sget-object v0, Lcom/kik/android/c/f;->b:Ljava/util/HashMap;

    const-string v1, ":O"

    const v2, 0x7f020288

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 263
    sget-object v0, Lcom/kik/android/c/f;->b:Ljava/util/HashMap;

    const-string v1, ":S"

    const v2, 0x7f020290

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 264
    sget-object v0, Lcom/kik/android/c/f;->b:Ljava/util/HashMap;

    const-string v1, ":$"

    const v2, 0x7f020284

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 265
    sget-object v0, Lcom/kik/android/c/f;->b:Ljava/util/HashMap;

    const-string v1, ":*"

    const v2, 0x7f020294

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 266
    sget-object v0, Lcom/kik/android/c/f;->b:Ljava/util/HashMap;

    const-string v1, ">:)"

    const v2, 0x7f02029d

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 267
    sget-object v0, Lcom/kik/android/c/f;->b:Ljava/util/HashMap;

    const-string v1, ":E"

    const v2, 0x7f020286

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 268
    sget-object v0, Lcom/kik/android/c/f;->b:Ljava/util/HashMap;

    const-string v1, "(KIK)"

    const v2, 0x7f0202a2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 269
    sget-object v0, Lcom/kik/android/c/f;->b:Ljava/util/HashMap;

    const-string v1, "D:"

    const v2, 0x7f02029a

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 272
    sget-object v6, Lcom/kik/android/c/f;->c:Ljava/util/List;

    new-instance v0, Lcom/kik/android/c/f$d;

    const-string v1, ":$"

    const-string v2, "d87e73fd"

    const v3, 0x7f0201d0

    const v4, 0x7f0201d1

    const v5, 0x7f0201d2

    invoke-direct/range {v0 .. v5}, Lcom/kik/android/c/f$d;-><init>(Ljava/lang/String;Ljava/lang/String;III)V

    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 273
    sget-object v6, Lcom/kik/android/c/f;->c:Ljava/util/List;

    new-instance v0, Lcom/kik/android/c/f$d;

    const-string v1, ":)"

    const-string v2, "49015869"

    const v3, 0x7f0201d3

    const v4, 0x7f0201d4

    const v5, 0x7f0201d5

    invoke-direct/range {v0 .. v5}, Lcom/kik/android/c/f$d;-><init>(Ljava/lang/String;Ljava/lang/String;III)V

    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 274
    sget-object v6, Lcom/kik/android/c/f;->c:Ljava/util/List;

    new-instance v0, Lcom/kik/android/c/f$d;

    const-string v1, ";)"

    const-string v2, "55f986b0"

    const v3, 0x7f0201d6

    const v4, 0x7f0201d7

    const v5, 0x7f0201d8

    invoke-direct/range {v0 .. v5}, Lcom/kik/android/c/f$d;-><init>(Ljava/lang/String;Ljava/lang/String;III)V

    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 276
    sget-object v6, Lcom/kik/android/c/f;->d:Ljava/util/List;

    new-instance v0, Lcom/kik/android/c/f$d;

    const-string v1, "B)"

    const-string v2, "d751b6d8"

    const v3, 0x7f020242

    const v4, 0x7f020243

    const v5, 0x7f020244

    invoke-direct/range {v0 .. v5}, Lcom/kik/android/c/f$d;-><init>(Ljava/lang/String;Ljava/lang/String;III)V

    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 277
    sget-object v6, Lcom/kik/android/c/f;->d:Ljava/util/List;

    new-instance v0, Lcom/kik/android/c/f$d;

    const-string v1, "<3"

    const-string v2, "12b64657"

    const v3, 0x7f020245

    const v4, 0x7f020246

    const v5, 0x7f020247

    invoke-direct/range {v0 .. v5}, Lcom/kik/android/c/f$d;-><init>(Ljava/lang/String;Ljava/lang/String;III)V

    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 278
    sget-object v6, Lcom/kik/android/c/f;->d:Ljava/util/List;

    new-instance v0, Lcom/kik/android/c/f$d;

    const-string v1, ":*"

    const-string v2, "20cd967c"

    const v3, 0x7f020248

    const v4, 0x7f020249

    const v5, 0x7f02024a

    invoke-direct/range {v0 .. v5}, Lcom/kik/android/c/f$d;-><init>(Ljava/lang/String;Ljava/lang/String;III)V

    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 280
    sget-object v0, Lcom/kik/android/c/f;->j:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/android/c/c;

    .line 281
    sget-object v2, Lcom/kik/android/c/f;->a:Ljava/util/HashMap;

    invoke-virtual {v0}, Lcom/kik/android/c/c;->g()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lcom/kik/android/c/c;->a()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v2, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 283
    :cond_0
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lkik/a/j/n;Lkik/a/e/v;Lcom/kik/g/p;Lkik/a/e/w;Lkik/a/e/t;Lkik/android/util/ar;Lkik/a/e/q;)V
    .locals 7

    .prologue
    .line 376
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 105
    new-instance v0, Lcom/kik/g/f;

    invoke-direct {v0}, Lcom/kik/g/f;-><init>()V

    iput-object v0, p0, Lcom/kik/android/c/f;->o:Lcom/kik/g/f;

    .line 377
    iput-object p5, p0, Lcom/kik/android/c/f;->k:Lkik/a/e/w;

    .line 378
    iput-object p6, p0, Lcom/kik/android/c/f;->l:Lkik/a/e/t;

    .line 379
    new-instance v0, Lcom/kik/android/c/l;

    new-instance v1, Lcom/kik/android/c/j;

    invoke-direct {v1, p1, p3}, Lcom/kik/android/c/j;-><init>(Landroid/content/Context;Lkik/a/e/v;)V

    invoke-static {p1}, Lkik/android/d/d;->a(Landroid/content/Context;)Lkik/android/d/c;

    move-result-object v4

    move-object v2, p2

    move-object v3, p3

    move-object v5, p1

    move-object v6, p7

    invoke-direct/range {v0 .. v6}, Lcom/kik/android/c/l;-><init>(Lcom/kik/android/c/d;Lkik/a/j/n;Lkik/a/e/v;Lkik/android/d/c;Landroid/content/Context;Lkik/android/util/ar;)V

    iput-object v0, p0, Lcom/kik/android/c/f;->i:Lcom/kik/android/c/l;

    .line 380
    new-instance v0, Lcom/kik/g/k;

    invoke-direct {v0, p0}, Lcom/kik/g/k;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lcom/kik/android/c/f;->q:Lcom/kik/g/k;

    .line 381
    const-string v0, "smileys"

    invoke-interface {p8, v0}, Lkik/a/e/q;->b(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    sput-object v0, Lcom/kik/android/c/f;->p:Ljava/io/File;

    .line 382
    new-instance v0, Ljava/io/File;

    invoke-virtual {p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v1

    const-string v2, "smileys"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 383
    sget-object v1, Lcom/kik/android/c/f;->p:Ljava/io/File;

    invoke-static {v0, v1}, Lkik/android/util/d;->a(Ljava/io/File;Ljava/io/File;)V

    .line 385
    const-string v1, "AN"

    .line 386
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x9

    if-lt v0, v2, :cond_0

    .line 389
    new-instance v0, Lcom/android/volley/toolbox/h;

    invoke-direct {v0}, Lcom/android/volley/toolbox/h;-><init>()V

    .line 397
    :goto_0
    new-instance v1, Lcom/android/volley/toolbox/a;

    invoke-direct {v1, v0}, Lcom/android/volley/toolbox/a;-><init>(Lcom/android/volley/toolbox/g;)V

    .line 398
    new-instance v0, Lcom/android/volley/toolbox/d;

    sget-object v2, Lcom/kik/android/c/f;->p:Ljava/io/File;

    const/high16 v3, 0x500000

    invoke-direct {v0, v2, v3}, Lcom/android/volley/toolbox/d;-><init>(Ljava/io/File;I)V

    sput-object v0, Lcom/kik/android/c/f;->f:Lcom/android/volley/toolbox/d;

    .line 399
    new-instance v0, Lcom/android/volley/p;

    sget-object v2, Lcom/kik/android/c/f;->f:Lcom/android/volley/toolbox/d;

    invoke-direct {v0, v2, v1}, Lcom/android/volley/p;-><init>(Lcom/android/volley/b;Lcom/android/volley/h;)V

    sput-object v0, Lcom/kik/android/c/f;->e:Lcom/android/volley/p;

    .line 400
    invoke-static {}, Lcom/kik/m/k;->a()Lcom/kik/cache/SimpleLruBitmapCache;

    move-result-object v0

    sput-object v0, Lcom/kik/android/c/f;->g:Lcom/kik/cache/SimpleLruBitmapCache;

    .line 401
    sget-object v0, Lcom/kik/android/c/f;->e:Lcom/android/volley/p;

    invoke-virtual {v0}, Lcom/android/volley/p;->a()V

    .line 403
    new-instance v0, Lcom/kik/cache/ad;

    sget-object v1, Lcom/kik/android/c/f;->e:Lcom/android/volley/p;

    sget-object v2, Lcom/kik/android/c/f;->g:Lcom/kik/cache/SimpleLruBitmapCache;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/kik/cache/ad;-><init>(Lcom/android/volley/p;Lcom/kik/cache/ad$b;Lcom/kik/cache/ap;)V

    .line 404
    sput-object v0, Lcom/kik/android/c/f;->h:Lcom/kik/cache/ad;

    invoke-virtual {v0}, Lcom/kik/cache/ad;->b()V

    .line 406
    iget-object v0, p0, Lcom/kik/android/c/f;->o:Lcom/kik/g/f;

    sget-object v1, Lcom/kik/android/c/f;->h:Lcom/kik/cache/ad;

    invoke-virtual {v1}, Lcom/kik/cache/ad;->a()Lcom/kik/g/e;

    move-result-object v1

    new-instance v2, Lcom/kik/android/c/g;

    invoke-direct {v2, p0}, Lcom/kik/android/c/g;-><init>(Lcom/kik/android/c/f;)V

    invoke-virtual {v0, v1, v2}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 414
    if-nez p4, :cond_1

    .line 415
    iget-object v0, p0, Lcom/kik/android/c/f;->i:Lcom/kik/android/c/l;

    invoke-virtual {v0}, Lcom/kik/android/c/l;->k()Lcom/kik/g/p;

    .line 428
    :goto_1
    return-void

    .line 394
    :cond_0
    new-instance v0, Lcom/android/volley/toolbox/e;

    invoke-static {v1}, Landroid/net/http/AndroidHttpClient;->newInstance(Ljava/lang/String;)Landroid/net/http/AndroidHttpClient;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/android/volley/toolbox/e;-><init>(Lorg/apache/http/client/HttpClient;)V

    goto :goto_0

    .line 418
    :cond_1
    new-instance v0, Lcom/kik/android/c/h;

    invoke-direct {v0, p0, p1}, Lcom/kik/android/c/h;-><init>(Lcom/kik/android/c/f;Landroid/content/Context;)V

    invoke-virtual {p4, v0}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    goto :goto_1
.end method

.method static synthetic a(Lcom/kik/android/c/f;)Lcom/kik/android/c/l;
    .locals 1

    .prologue
    .line 80
    iget-object v0, p0, Lcom/kik/android/c/f;->i:Lcom/kik/android/c/l;

    return-object v0
.end method

.method private static a(Ljava/lang/CharSequence;)Lcom/kik/i/a/a/c;
    .locals 9

    .prologue
    const/4 v0, 0x0

    const/4 v2, 0x0

    .line 622
    if-nez p0, :cond_0

    .line 642
    :goto_0
    return-object v0

    .line 625
    :cond_0
    new-instance v1, Lcom/kik/i/a/a/c;

    invoke-direct {v1}, Lcom/kik/i/a/a/c;-><init>()V

    .line 626
    invoke-static {}, Lkik/android/util/cj;->a()Lkik/android/util/cj;

    move-result-object v3

    invoke-virtual {v3, p0}, Lkik/android/util/cj;->b(Ljava/lang/CharSequence;)[Lkik/android/util/bk$a;

    move-result-object v4

    .line 628
    array-length v5, v4

    move v3, v2

    :goto_1
    if-ge v2, v5, :cond_1

    aget-object v6, v4, v2

    .line 629
    new-instance v7, Lcom/kik/i/a/a/a;

    invoke-direct {v7}, Lcom/kik/i/a/a/a;-><init>()V

    .line 630
    invoke-virtual {v6}, Lkik/android/util/bk$a;->c()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lcom/kik/android/c/f;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 631
    invoke-virtual {v7, v0}, Lcom/kik/i/a/a/a;->b(Ljava/lang/String;)Lcom/kik/i/a/a/a;

    .line 632
    invoke-virtual {v7, v8}, Lcom/kik/i/a/a/a;->a(Ljava/lang/String;)Lcom/kik/i/a/a/a;

    .line 633
    invoke-virtual {v6}, Lkik/android/util/bk$a;->b()I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v7, v8}, Lcom/kik/i/a/a/a;->b(Ljava/lang/Integer;)Lcom/kik/i/a/a/a;

    .line 634
    invoke-virtual {v6}, Lkik/android/util/bk$a;->a()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v7, v6}, Lcom/kik/i/a/a/a;->a(Ljava/lang/Integer;)Lcom/kik/i/a/a/a;

    .line 635
    invoke-virtual {v1, v7}, Lcom/kik/i/a/a/c;->a(Lcom/kik/i/a/a/a;)Lcom/kik/i/a/a/c;

    .line 636
    add-int/lit8 v3, v3, 0x1

    const/16 v6, 0x32

    if-ge v3, v6, :cond_1

    .line 638
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    move-object v0, v1

    .line 642
    goto :goto_0
.end method

.method public static a(Landroid/content/Context;Lcom/kik/android/c/e;)Ljava/lang/CharSequence;
    .locals 11

    .prologue
    const/4 v4, 0x0

    const/16 v10, 0x21

    const/16 v8, 0x15

    const/4 v7, 0x0

    .line 647
    if-eqz p1, :cond_0

    if-nez p0, :cond_1

    .line 689
    :cond_0
    :goto_0
    return-object v4

    .line 650
    :cond_1
    invoke-virtual {p1}, Lcom/kik/android/c/e;->g()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lcom/kik/android/c/e;->f()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_3

    .line 651
    :cond_2
    invoke-virtual {p1}, Lcom/kik/android/c/e;->f()Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    .line 653
    :cond_3
    invoke-virtual {p1}, Lcom/kik/android/c/e;->e()Ljava/lang/String;

    move-result-object v3

    .line 654
    invoke-virtual {p1}, Lcom/kik/android/c/e;->g()Ljava/lang/String;

    move-result-object v2

    .line 655
    invoke-virtual {p1}, Lcom/kik/android/c/e;->f()Ljava/lang/String;

    move-result-object v9

    .line 656
    invoke-static {v3}, Lcom/kik/android/c/f;->i(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 659
    if-eqz v0, :cond_4

    .line 660
    new-instance v1, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-direct {v1, v5, v0}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    move v6, v7

    .line 680
    :goto_1
    invoke-static {v8}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v0

    invoke-static {v8}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v5

    invoke-virtual {v1, v7, v7, v0, v5}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 684
    new-instance v8, Landroid/text/SpannableStringBuilder;

    invoke-direct {v8, v9}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 687
    new-instance v0, Lcom/kik/android/c/b;

    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v5

    invoke-direct/range {v0 .. v6}, Lcom/kik/android/c/b;-><init>(Landroid/graphics/drawable/Drawable;Ljava/lang/String;Ljava/lang/String;Lkik/android/e/f;IZ)V

    .line 688
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {v8, v0, v7, v1, v10}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    move-object v4, v8

    .line 689
    goto :goto_0

    .line 664
    :cond_4
    if-nez v3, :cond_5

    .line 666
    invoke-static {v2}, Lcom/kik/android/c/f;->e(Ljava/lang/String;)I

    move-result v0

    .line 671
    :goto_2
    if-gtz v0, :cond_6

    .line 673
    new-instance v4, Landroid/text/SpannableStringBuilder;

    invoke-direct {v4, v9}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 674
    new-instance v0, Lcom/kik/android/c/k;

    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v1

    invoke-direct {v0, v3, v1}, Lcom/kik/android/c/k;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {v4, v0, v7, v1, v10}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    goto :goto_0

    .line 669
    :cond_5
    invoke-virtual {p1}, Lcom/kik/android/c/e;->g()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/kik/android/c/f;->f(Ljava/lang/String;)I

    move-result v0

    goto :goto_2

    .line 677
    :cond_6
    const/4 v6, 0x1

    .line 678
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    goto :goto_1
.end method

.method public static a(Landroid/content/Context;Ljava/lang/CharSequence;Lcom/kik/i/a/a/c;IZLkik/android/e/f;)Ljava/lang/CharSequence;
    .locals 6

    .prologue
    .line 695
    if-eqz p1, :cond_0

    if-nez p0, :cond_1

    .line 696
    :cond_0
    const-string v1, ""

    .line 704
    :goto_0
    return-object v1

    .line 699
    :cond_1
    new-instance v1, Landroid/text/SpannableStringBuilder;

    invoke-direct {v1, p1}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 700
    if-eqz p2, :cond_2

    invoke-static {p2, p1}, Lcom/kik/android/c/f;->a(Lcom/kik/i/a/a/c;Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 701
    :cond_2
    invoke-static {p1}, Lcom/kik/android/c/f;->a(Ljava/lang/CharSequence;)Lcom/kik/i/a/a/c;

    move-result-object v2

    :goto_1
    move-object v0, p0

    move v3, p3

    move v4, p4

    move-object v5, p5

    .line 703
    invoke-static/range {v0 .. v5}, Lcom/kik/android/c/f;->a(Landroid/content/Context;Landroid/text/Spannable;Lcom/kik/i/a/a/c;IZLkik/android/e/f;)V

    goto :goto_0

    :cond_3
    move-object v2, p2

    goto :goto_1
.end method

.method public static a(Ljava/util/List;)Lorg/json/JSONObject;
    .locals 8

    .prologue
    .line 984
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 985
    new-instance v2, Lorg/json/JSONArray;

    invoke-direct {v2}, Lorg/json/JSONArray;-><init>()V

    .line 986
    if-eqz p0, :cond_1

    .line 988
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/android/c/e;

    .line 989
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/kik/android/c/e;->e()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_0

    .line 990
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 994
    :try_start_0
    const-string v5, "title"

    invoke-virtual {v0}, Lcom/kik/android/c/e;->d()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 995
    const-string v5, "text"

    invoke-virtual {v0}, Lcom/kik/android/c/e;->f()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 996
    const-string v5, "id"

    invoke-virtual {v0}, Lcom/kik/android/c/e;->e()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 997
    const-string v5, "install-date"

    invoke-virtual {v0}, Lcom/kik/android/c/e;->i()J

    move-result-wide v6

    invoke-virtual {v4, v5, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 998
    const-string v5, "active"

    invoke-virtual {v0}, Lcom/kik/android/c/e;->h()Z

    move-result v0

    invoke-virtual {v4, v5, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 999
    invoke-virtual {v2, v4}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 1001
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    goto :goto_0

    .line 1007
    :cond_1
    :try_start_1
    const-string v0, "smileys"

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    .line 1012
    :goto_1
    return-object v1

    .line 1009
    :catch_1
    move-exception v0

    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    goto :goto_1
.end method

.method private static a(Landroid/content/Context;Landroid/text/Spannable;Lcom/kik/i/a/a/c;IZLkik/android/e/f;)V
    .locals 11

    .prologue
    .line 1147
    if-eqz p0, :cond_0

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lcom/kik/i/a/a/c;->b()Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_1

    .line 1208
    :cond_0
    return-void

    .line 1152
    :cond_1
    const/4 v0, 0x0

    invoke-interface {p1}, Landroid/text/Spannable;->length()I

    move-result v1

    const-class v2, Landroid/text/style/ImageSpan;

    invoke-interface {p1, v0, v1, v2}, Landroid/text/Spannable;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroid/text/style/ImageSpan;

    array-length v2, v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v2, :cond_2

    aget-object v3, v0, v1

    .line 1153
    invoke-interface {p1, v3}, Landroid/text/Spannable;->removeSpan(Ljava/lang/Object;)V

    .line 1152
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 1155
    :cond_2
    const/4 v0, 0x0

    .line 1157
    invoke-virtual {p2}, Lcom/kik/i/a/a/c;->b()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    move v8, v0

    :cond_3
    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/kik/i/a/a/a;

    .line 1159
    if-eqz v7, :cond_3

    invoke-virtual {v7}, Lcom/kik/i/a/a/a;->c()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ltz v0, :cond_3

    invoke-virtual {v7}, Lcom/kik/i/a/a/a;->d()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-interface {p1}, Landroid/text/Spannable;->length()I

    move-result v1

    if-gt v0, v1, :cond_3

    invoke-virtual {v7}, Lcom/kik/i/a/a/a;->c()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v7}, Lcom/kik/i/a/a/a;->d()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ge v0, v1, :cond_3

    .line 1161
    invoke-virtual {v7}, Lcom/kik/i/a/a/a;->f()Ljava/lang/String;

    move-result-object v3

    .line 1166
    invoke-virtual {v7}, Lcom/kik/i/a/a/a;->e()Ljava/lang/String;

    move-result-object v2

    .line 1167
    invoke-static {v3}, Lcom/kik/android/c/f;->i(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 1168
    const/4 v6, 0x0

    .line 1170
    if-eqz v0, :cond_4

    .line 1171
    new-instance v1, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-direct {v1, v4, v0}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 1191
    :goto_2
    if-lez p3, :cond_6

    .line 1192
    const/4 v0, 0x0

    const/4 v4, 0x0

    invoke-static {p3}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v5

    invoke-static {p3}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v10

    invoke-virtual {v1, v0, v4, v5, v10}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 1198
    :goto_3
    if-eqz p4, :cond_7

    .line 1199
    new-instance v0, Lkik/android/widget/u;

    invoke-virtual {v7}, Lcom/kik/i/a/a/a;->d()Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-virtual {v7}, Lcom/kik/i/a/a/a;->c()Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    sub-int v5, v4, v5

    move-object/from16 v4, p5

    invoke-direct/range {v0 .. v6}, Lkik/android/widget/u;-><init>(Landroid/graphics/drawable/Drawable;Ljava/lang/String;Ljava/lang/String;Lkik/android/e/f;IZ)V

    .line 1205
    :goto_4
    invoke-virtual {v7}, Lcom/kik/i/a/a/a;->c()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v7}, Lcom/kik/i/a/a/a;->d()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/16 v3, 0x21

    invoke-interface {p1, v0, v1, v2, v3}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 1206
    add-int/lit8 v0, v8, 0x1

    const/16 v1, 0x32

    if-ge v0, v1, :cond_0

    move v8, v0

    goto/16 :goto_1

    .line 1176
    :cond_4
    invoke-static {v3}, Lkik/android/util/cq;->c(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 1178
    invoke-virtual {v7}, Lcom/kik/i/a/a/a;->e()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/kik/android/c/f;->e(Ljava/lang/String;)I

    move-result v0

    .line 1184
    :goto_5
    if-lez v0, :cond_3

    .line 1185
    const/4 v6, 0x1

    .line 1188
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    goto :goto_2

    .line 1182
    :cond_5
    invoke-virtual {v7}, Lcom/kik/i/a/a/a;->e()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/kik/android/c/f;->f(Ljava/lang/String;)I

    move-result v0

    goto :goto_5

    .line 1195
    :cond_6
    const/4 v0, 0x0

    const/4 v4, 0x0

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v5

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v10

    invoke-virtual {v1, v0, v4, v5, v10}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    goto :goto_3

    .line 1202
    :cond_7
    new-instance v0, Lcom/kik/android/c/b;

    invoke-virtual {v7}, Lcom/kik/i/a/a/a;->d()Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-virtual {v7}, Lcom/kik/i/a/a/a;->c()Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    sub-int v5, v4, v5

    move-object/from16 v4, p5

    invoke-direct/range {v0 .. v6}, Lcom/kik/android/c/b;-><init>(Landroid/graphics/drawable/Drawable;Ljava/lang/String;Ljava/lang/String;Lkik/android/e/f;IZ)V

    goto :goto_4
.end method

.method public static a(Landroid/content/Context;Landroid/text/Spannable;Ljava/lang/String;)V
    .locals 12

    .prologue
    const/16 v11, 0x15

    const/4 v6, 0x0

    .line 771
    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    if-nez p0, :cond_1

    .line 804
    :cond_0
    return-void

    .line 774
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p1}, Landroid/text/Spannable;->length()I

    move-result v1

    const-class v2, Lcom/kik/android/c/i;

    invoke-interface {p1, v6, v1, v2}, Landroid/text/Spannable;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 776
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_2
    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/kik/android/c/i;

    .line 777
    if-eqz v7, :cond_2

    invoke-interface {v7}, Lcom/kik/android/c/i;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v7}, Lcom/kik/android/c/i;->e()Z

    move-result v0

    if-nez v0, :cond_2

    .line 778
    invoke-static {p2}, Lcom/kik/android/c/f;->i(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 781
    if-eqz v0, :cond_2

    .line 783
    new-instance v1, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 790
    invoke-static {v11}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v0

    invoke-static {v11}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v2

    invoke-virtual {v1, v6, v6, v0, v2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 794
    invoke-interface {p1, v7}, Landroid/text/Spannable;->getSpanStart(Ljava/lang/Object;)I

    move-result v9

    .line 797
    invoke-interface {p1, v7}, Landroid/text/Spannable;->getSpanEnd(Ljava/lang/Object;)I

    move-result v10

    .line 799
    new-instance v0, Lcom/kik/android/c/b;

    invoke-interface {v7}, Lcom/kik/android/c/i;->c()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x0

    invoke-interface {v7}, Lcom/kik/android/c/i;->d()I

    move-result v5

    move-object v3, p2

    invoke-direct/range {v0 .. v6}, Lcom/kik/android/c/b;-><init>(Landroid/graphics/drawable/Drawable;Ljava/lang/String;Ljava/lang/String;Lkik/android/e/f;IZ)V

    .line 800
    invoke-interface {p1, v7}, Landroid/text/Spannable;->removeSpan(Ljava/lang/Object;)V

    .line 801
    const/16 v1, 0x21

    invoke-interface {p1, v0, v9, v10, v1}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    goto :goto_0
.end method

.method public static a(Landroid/text/Spannable;)V
    .locals 4

    .prologue
    .line 738
    if-nez p0, :cond_1

    .line 745
    :cond_0
    return-void

    .line 741
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-interface {p0}, Landroid/text/Spannable;->length()I

    move-result v2

    const-class v3, Lcom/kik/android/c/f$a;

    invoke-interface {p0, v1, v2, v3}, Landroid/text/Spannable;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 742
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/android/c/f$a;

    .line 743
    invoke-interface {p0, v0}, Landroid/text/Spannable;->removeSpan(Ljava/lang/Object;)V

    goto :goto_0
.end method

.method public static a(Landroid/widget/EditText;)V
    .locals 8

    .prologue
    .line 808
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    instance-of v0, v0, Landroid/text/Spannable;

    if-nez v0, :cond_1

    .line 833
    :cond_0
    :goto_0
    return-void

    .line 811
    :cond_1
    invoke-virtual {p0}, Landroid/widget/EditText;->getSelectionEnd()I

    move-result v0

    invoke-virtual {p0}, Landroid/widget/EditText;->getSelectionStart()I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 814
    invoke-virtual {p0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v3

    .line 815
    new-instance v2, Ljava/util/ArrayList;

    invoke-virtual {p0}, Landroid/widget/EditText;->getSelectionStart()I

    move-result v0

    invoke-virtual {p0}, Landroid/widget/EditText;->getSelectionStart()I

    move-result v1

    const-class v4, Lcom/kik/android/c/b;

    invoke-interface {v3, v0, v1, v4}, Landroid/text/Spannable;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 816
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 817
    invoke-virtual {p0}, Landroid/widget/EditText;->getSelectionEnd()I

    move-result v4

    .line 818
    const/4 v1, -0x1

    .line 819
    const/4 v0, 0x0

    .line 820
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    move v2, v1

    move v1, v0

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/android/c/b;

    .line 821
    invoke-interface {v3, v0}, Landroid/text/Spannable;->getSpanStart(Ljava/lang/Object;)I

    move-result v6

    if-ge v6, v4, :cond_2

    invoke-interface {v3, v0}, Landroid/text/Spannable;->getSpanEnd(Ljava/lang/Object;)I

    move-result v6

    if-le v6, v4, :cond_2

    .line 822
    const/4 v1, 0x1

    .line 824
    :cond_2
    invoke-interface {v3, v0}, Landroid/text/Spannable;->getSpanEnd(Ljava/lang/Object;)I

    move-result v0

    .line 825
    if-ltz v2, :cond_3

    sub-int v6, v0, v4

    invoke-static {v6}, Ljava/lang/Math;->abs(I)I

    move-result v6

    sub-int v7, v2, v4

    invoke-static {v7}, Ljava/lang/Math;->abs(I)I

    move-result v7

    if-ge v6, v7, :cond_5

    :cond_3
    :goto_2
    move v2, v0

    .line 828
    goto :goto_1

    .line 829
    :cond_4
    if-ltz v2, :cond_0

    if-eqz v1, :cond_0

    .line 830
    invoke-virtual {p0, v2}, Landroid/widget/EditText;->setSelection(I)V

    goto :goto_0

    :cond_5
    move v0, v2

    goto :goto_2
.end method

.method static synthetic a(Lcom/kik/android/c/f;Landroid/content/Context;)V
    .locals 10

    .prologue
    const-wide/16 v6, 0x3

    const/4 v0, 0x0

    const/16 v5, 0x10

    .line 80
    iget-object v1, p0, Lcom/kik/android/c/f;->i:Lcom/kik/android/c/l;

    invoke-virtual {v1}, Lcom/kik/android/c/l;->g()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/kik/android/c/f;->k:Lkik/a/e/w;

    invoke-interface {v1}, Lkik/a/e/w;->d()Lkik/a/d/aa;

    move-result-object v1

    iget-object v1, v1, Lkik/a/d/aa;->c:Ljava/lang/String;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-nez v2, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/kik/android/c/f;->l:Lkik/a/e/t;

    invoke-interface {v2, v1}, Lkik/a/e/t;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    const/16 v3, 0x8

    if-lt v2, v3, :cond_0

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, -0x8

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, -0x4

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, -0x4

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v4

    invoke-virtual {v1, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v5}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v2

    rem-long/2addr v2, v6

    long-to-int v2, v2

    invoke-static {v1, v5}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v4

    rem-long/2addr v4, v6

    long-to-int v3, v4

    sget-object v1, Lcom/kik/android/c/f;->c:Ljava/util/List;

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Lcom/kik/android/c/f$d;

    sget-object v1, Lcom/kik/android/c/f;->d:Ljava/util/List;

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Lcom/kik/android/c/f$d;

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v6}, Lcom/kik/android/c/f$d;->a(Lcom/kik/android/c/f$d;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v6}, Lcom/kik/android/c/f$d;->b(Lcom/kik/android/c/f$d;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v6}, Lcom/kik/android/c/f$d;->a(Lcom/kik/android/c/f$d;)Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Lkik/a/h/j;->b()J

    move-result-wide v4

    invoke-static/range {v0 .. v5}, Lcom/kik/android/c/e;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)Lcom/kik/android/c/e;

    move-result-object v9

    invoke-static {v7}, Lcom/kik/android/c/f$d;->a(Lcom/kik/android/c/f$d;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v7}, Lcom/kik/android/c/f$d;->b(Lcom/kik/android/c/f$d;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v7}, Lcom/kik/android/c/f$d;->a(Lcom/kik/android/c/f$d;)Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Lkik/a/h/j;->b()J

    move-result-wide v4

    invoke-static/range {v0 .. v5}, Lcom/kik/android/c/e;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)Lcom/kik/android/c/e;

    move-result-object v1

    invoke-interface {v8, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {v8, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v9}, Lcom/kik/android/c/e;->e()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/kik/cache/aw;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v6}, Lcom/kik/android/c/f$d;->a()I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/kik/android/c/f;->a(Ljava/lang/String;Landroid/graphics/Bitmap;)V

    invoke-virtual {v1}, Lcom/kik/android/c/e;->e()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/kik/cache/aw;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v7}, Lcom/kik/android/c/f$d;->a()I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/kik/android/c/f;->a(Ljava/lang/String;Landroid/graphics/Bitmap;)V

    invoke-virtual {v9}, Lcom/kik/android/c/e;->e()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/kik/cache/aj;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v6}, Lcom/kik/android/c/f$d;->b()I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/kik/android/c/f;->a(Ljava/lang/String;Landroid/graphics/Bitmap;)V

    invoke-virtual {v1}, Lcom/kik/android/c/e;->e()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/kik/cache/aj;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v7}, Lcom/kik/android/c/f$d;->b()I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/kik/android/c/f;->a(Ljava/lang/String;Landroid/graphics/Bitmap;)V

    iget-object v0, p0, Lcom/kik/android/c/f;->i:Lcom/kik/android/c/l;

    invoke-virtual {v0, v8}, Lcom/kik/android/c/l;->a(Ljava/util/List;)V

    iget-object v0, p0, Lcom/kik/android/c/f;->i:Lcom/kik/android/c/l;

    invoke-virtual {v0}, Lcom/kik/android/c/l;->h()V

    goto/16 :goto_0
.end method

.method static synthetic a(Lcom/kik/cache/z;)V
    .locals 2

    .prologue
    .line 80
    if-eqz p0, :cond_0

    instance-of v0, p0, Lcom/kik/cache/aw;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/kik/android/c/f;->q:Lcom/kik/g/k;

    check-cast p0, Lcom/kik/cache/aw;

    invoke-virtual {p0}, Lcom/kik/cache/aw;->u()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method private static a(Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 6

    .prologue
    const-wide/32 v4, 0x41353000

    .line 473
    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    .line 475
    :try_start_0
    new-instance v0, Lcom/android/volley/b$a;

    invoke-direct {v0}, Lcom/android/volley/b$a;-><init>()V

    .line 476
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    add-long/2addr v2, v4

    iput-wide v2, v0, Lcom/android/volley/b$a;->d:J

    .line 477
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    add-long/2addr v2, v4

    iput-wide v2, v0, Lcom/android/volley/b$a;->e:J

    .line 478
    sget-object v1, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v2, 0x64

    invoke-static {p1, v1, v2}, Lcom/kik/m/k;->b(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap$CompressFormat;I)[B

    move-result-object v1

    iput-object v1, v0, Lcom/android/volley/b$a;->a:[B

    .line 479
    sget-object v1, Lcom/kik/android/c/f;->f:Lcom/android/volley/toolbox/d;

    invoke-virtual {v1, p0, v0}, Lcom/android/volley/toolbox/d;->a(Ljava/lang/String;Lcom/android/volley/b$a;)V
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    .line 485
    :cond_0
    :goto_0
    return-void

    .line 481
    :catch_0
    move-exception v0

    .line 482
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "unable to rip smiley Image:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0
.end method

.method public static a(Landroid/text/Editable;)Z
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 719
    if-nez p0, :cond_0

    move v0, v1

    .line 733
    :goto_0
    return v0

    .line 722
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p0}, Landroid/text/Editable;->length()I

    move-result v2

    const-class v3, Lcom/kik/android/c/i;

    invoke-interface {p0, v1, v2, v3}, Landroid/text/Editable;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 723
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/android/c/i;

    .line 724
    invoke-interface {p0, v0}, Landroid/text/Editable;->getSpanStart(Ljava/lang/Object;)I

    move-result v3

    .line 725
    invoke-interface {p0, v0}, Landroid/text/Editable;->getSpanEnd(Ljava/lang/Object;)I

    move-result v4

    .line 726
    sub-int v5, v4, v3

    .line 727
    invoke-interface {v0}, Lcom/kik/android/c/i;->d()I

    move-result v0

    if-ge v5, v0, :cond_1

    if-lez v5, :cond_1

    .line 729
    new-instance v0, Lcom/kik/android/c/f$a;

    invoke-direct {v0}, Lcom/kik/android/c/f$a;-><init>()V

    const/16 v1, 0x21

    invoke-interface {p0, v0, v3, v4, v1}, Landroid/text/Editable;->setSpan(Ljava/lang/Object;III)V

    .line 730
    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    move v0, v1

    .line 733
    goto :goto_0
.end method

.method private static a(Lcom/kik/i/a/a/c;Ljava/lang/CharSequence;)Z
    .locals 5

    .prologue
    const/4 v2, 0x0

    .line 489
    if-eqz p0, :cond_0

    if-nez p1, :cond_1

    :cond_0
    move v0, v2

    .line 513
    :goto_0
    return v0

    .line 492
    :cond_1
    invoke-virtual {p0}, Lcom/kik/i/a/a/c;->b()Ljava/util/List;

    move-result-object v1

    .line 493
    if-nez v1, :cond_2

    move v0, v2

    .line 494
    goto :goto_0

    .line 497
    :cond_2
    sget-object v0, Lcom/kik/android/c/f;->m:Ljava/util/Comparator;

    invoke-static {v1, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 498
    const/4 v0, 0x0

    .line 499
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move-object v1, v0

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/i/a/a/a;

    .line 500
    invoke-virtual {v0}, Lcom/kik/i/a/a/a;->c()Ljava/lang/Integer;

    move-result-object v4

    if-eqz v4, :cond_3

    invoke-virtual {v0}, Lcom/kik/i/a/a/a;->d()Ljava/lang/Integer;

    move-result-object v4

    if-eqz v4, :cond_3

    invoke-virtual {v0}, Lcom/kik/i/a/a/a;->c()Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-gez v4, :cond_4

    :cond_3
    move v0, v2

    .line 504
    goto :goto_0

    .line 508
    :cond_4
    if-eqz v1, :cond_5

    invoke-virtual {v0}, Lcom/kik/i/a/a/a;->c()Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-virtual {v1}, Lcom/kik/i/a/a/a;->d()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ge v4, v1, :cond_5

    move v0, v2

    .line 509
    goto :goto_0

    :cond_5
    move-object v1, v0

    .line 512
    goto :goto_1

    .line 513
    :cond_6
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public static b(Landroid/text/Spannable;)Lcom/kik/i/a/a/c;
    .locals 5

    .prologue
    .line 1030
    if-nez p0, :cond_0

    .line 1031
    const/4 v0, 0x0

    .line 1046
    :goto_0
    return-object v0

    .line 1033
    :cond_0
    new-instance v1, Lcom/kik/i/a/a/c;

    invoke-direct {v1}, Lcom/kik/i/a/a/c;-><init>()V

    .line 1034
    new-instance v0, Ljava/util/ArrayList;

    const/4 v2, 0x0

    invoke-interface {p0}, Landroid/text/Spannable;->length()I

    move-result v3

    const-class v4, Lcom/kik/android/c/i;

    invoke-interface {p0, v2, v3, v4}, Landroid/text/Spannable;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 1035
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/android/c/i;

    .line 1036
    if-eqz v0, :cond_1

    .line 1037
    new-instance v3, Lcom/kik/i/a/a/a;

    invoke-direct {v3}, Lcom/kik/i/a/a/a;-><init>()V

    .line 1040
    invoke-interface {v0}, Lcom/kik/android/c/i;->b()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/kik/i/a/a/a;->b(Ljava/lang/String;)Lcom/kik/i/a/a/a;

    .line 1041
    invoke-interface {v0}, Lcom/kik/android/c/i;->c()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/kik/i/a/a/a;->a(Ljava/lang/String;)Lcom/kik/i/a/a/a;

    .line 1042
    invoke-interface {p0, v0}, Landroid/text/Spannable;->getSpanStart(Ljava/lang/Object;)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/kik/i/a/a/a;->a(Ljava/lang/Integer;)Lcom/kik/i/a/a/a;

    .line 1043
    invoke-interface {p0, v0}, Landroid/text/Spannable;->getSpanEnd(Ljava/lang/Object;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/kik/i/a/a/a;->b(Ljava/lang/Integer;)Lcom/kik/i/a/a/a;

    .line 1044
    invoke-virtual {v1, v3}, Lcom/kik/i/a/a/c;->a(Lcom/kik/i/a/a/a;)Lcom/kik/i/a/a/c;

    goto :goto_1

    :cond_2
    move-object v0, v1

    .line 1046
    goto :goto_0
.end method

.method public static b(Landroid/text/Editable;)V
    .locals 4

    .prologue
    .line 749
    if-nez p0, :cond_1

    .line 759
    :cond_0
    return-void

    .line 752
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-interface {p0}, Landroid/text/Editable;->length()I

    move-result v2

    const-class v3, Lcom/kik/android/c/f$a;

    invoke-interface {p0, v1, v2, v3}, Landroid/text/Editable;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 753
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/android/c/f$a;

    .line 754
    if-eqz v0, :cond_2

    .line 755
    invoke-interface {p0, v0}, Landroid/text/Editable;->getSpanStart(Ljava/lang/Object;)I

    move-result v2

    invoke-interface {p0, v0}, Landroid/text/Editable;->getSpanEnd(Ljava/lang/Object;)I

    move-result v0

    const-string v3, ""

    invoke-interface {p0, v2, v0, v3}, Landroid/text/Editable;->replace(IILjava/lang/CharSequence;)Landroid/text/Editable;

    goto :goto_0
.end method

.method private static b(Ljava/util/List;)V
    .locals 7

    .prologue
    const/4 v3, 0x0

    .line 887
    if-nez p0, :cond_1

    .line 898
    :cond_0
    return-void

    .line 890
    :cond_1
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_2
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/android/c/e;

    .line 891
    if-eqz v0, :cond_2

    .line 892
    invoke-virtual {v0}, Lcom/kik/android/c/e;->e()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/kik/android/c/f;->i(Ljava/lang/String;)Landroid/graphics/Bitmap;

    .line 896
    invoke-virtual {v0}, Lcom/kik/android/c/e;->e()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    sget-object v1, Lcom/kik/cache/aj;->e:Lcom/android/volley/r$b;

    sget-object v2, Lcom/kik/cache/aj;->d:Lcom/android/volley/r$a;

    invoke-static {v0, v1, v2}, Lcom/kik/cache/aj;->a(Ljava/lang/String;Lcom/android/volley/r$b;Lcom/android/volley/r$a;)Lcom/kik/cache/aj;

    move-result-object v1

    sget-object v0, Lcom/kik/android/c/f;->h:Lcom/kik/cache/ad;

    sget-object v2, Lcom/kik/cache/ad;->a:Lcom/kik/cache/ad$d;

    const/4 v5, 0x1

    move v4, v3

    invoke-virtual/range {v0 .. v5}, Lcom/kik/cache/ad;->a(Lcom/kik/cache/z;Lcom/kik/cache/ad$d;IIZ)Lcom/kik/cache/ad$c;

    goto :goto_0
.end method

.method public static b(Lorg/json/JSONObject;)V
    .locals 1

    .prologue
    .line 880
    invoke-static {p0}, Lcom/kik/android/c/f;->c(Lorg/json/JSONObject;)Ljava/util/List;

    move-result-object v0

    .line 881
    invoke-static {p0}, Lcom/kik/android/c/f;->d(Lorg/json/JSONObject;)V

    .line 882
    invoke-static {v0}, Lcom/kik/android/c/f;->b(Ljava/util/List;)V

    .line 883
    return-void
.end method

.method public static c()Lcom/kik/g/e;
    .locals 1

    .prologue
    .line 297
    sget-object v0, Lcom/kik/android/c/f;->q:Lcom/kik/g/k;

    invoke-virtual {v0}, Lcom/kik/g/k;->a()Lcom/kik/g/e;

    move-result-object v0

    return-object v0
.end method

.method public static c(Lorg/json/JSONObject;)Ljava/util/List;
    .locals 10

    .prologue
    const/4 v8, 0x0

    .line 966
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 967
    if-nez p0, :cond_0

    move-object v0, v7

    .line 979
    :goto_0
    return-object v0

    .line 970
    :cond_0
    const-string v0, "smileys"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v9

    .line 971
    if-eqz v9, :cond_4

    .line 972
    const/4 v0, 0x0

    move v6, v0

    :goto_1
    invoke-virtual {v9}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v6, v0, :cond_4

    .line 973
    invoke-virtual {v9, v6}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v3

    if-nez v3, :cond_2

    move-object v0, v8

    .line 974
    :goto_2
    if-eqz v0, :cond_1

    .line 975
    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 972
    :cond_1
    add-int/lit8 v0, v6, 0x1

    move v6, v0

    goto :goto_1

    .line 973
    :cond_2
    const-string v0, "id"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_3

    move-object v0, v8

    goto :goto_2

    :cond_3
    const-string v0, "title"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "categoryId"

    invoke-virtual {v3, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "id"

    invoke-virtual {v3, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v4, "text"

    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Lkik/a/h/j;->b()J

    move-result-wide v4

    invoke-static/range {v0 .. v5}, Lcom/kik/android/c/e;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)Lcom/kik/android/c/e;

    move-result-object v0

    goto :goto_2

    :cond_4
    move-object v0, v7

    .line 979
    goto :goto_0
.end method

.method private static d(Lorg/json/JSONObject;)V
    .locals 10

    .prologue
    const-wide/32 v8, 0x41353000

    .line 902
    if-nez p0, :cond_1

    .line 932
    :cond_0
    return-void

    .line 905
    :cond_1
    const-string v0, "smileys"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v2

    .line 906
    if-eqz v2, :cond_0

    .line 907
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 908
    invoke-virtual {v2, v0}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v1

    .line 909
    if-eqz v1, :cond_2

    .line 910
    const-string v3, "id"

    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 911
    const-string v4, "image"

    const/4 v5, 0x0

    invoke-virtual {v1, v4, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 912
    if-eqz v3, :cond_2

    if-eqz v1, :cond_2

    .line 914
    const/16 v4, 0x10

    :try_start_0
    invoke-static {v1, v4}, Lcom/kik/m/e;->a(Ljava/lang/String;I)[B

    move-result-object v1

    .line 915
    invoke-static {v3}, Lcom/kik/cache/aw;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 916
    new-instance v4, Lcom/android/volley/b$a;

    invoke-direct {v4}, Lcom/android/volley/b$a;-><init>()V

    .line 917
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    add-long/2addr v6, v8

    iput-wide v6, v4, Lcom/android/volley/b$a;->d:J

    .line 918
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    add-long/2addr v6, v8

    iput-wide v6, v4, Lcom/android/volley/b$a;->e:J

    .line 919
    iput-object v1, v4, Lcom/android/volley/b$a;->a:[B

    .line 920
    sget-object v1, Lcom/kik/android/c/f;->f:Lcom/android/volley/toolbox/d;

    invoke-virtual {v1, v3, v4}, Lcom/android/volley/toolbox/d;->a(Ljava/lang/String;Lcom/android/volley/b$a;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_1

    .line 907
    :cond_2
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 922
    :catch_0
    move-exception v1

    .line 923
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "unable to rip smiley Image:"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 925
    :catch_1
    move-exception v1

    .line 926
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "unable to rip smiley Image:"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/OutOfMemoryError;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1
.end method

.method private static e(Ljava/lang/String;)I
    .locals 3

    .prologue
    const/4 v0, -0x1

    .line 529
    if-nez p0, :cond_1

    .line 536
    :cond_0
    :goto_0
    return v0

    .line 532
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    .line 533
    sget-object v2, Lcom/kik/android/c/f;->a:Ljava/util/HashMap;

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 534
    sget-object v0, Lcom/kik/android/c/f;->a:Ljava/util/HashMap;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_0
.end method

.method public static e()Lcom/kik/cache/ad;
    .locals 1

    .prologue
    .line 857
    sget-object v0, Lcom/kik/android/c/f;->h:Lcom/kik/cache/ad;

    return-object v0
.end method

.method private static f(Ljava/lang/String;)I
    .locals 3

    .prologue
    const/4 v0, -0x1

    .line 541
    if-nez p0, :cond_1

    .line 548
    :cond_0
    :goto_0
    return v0

    .line 544
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    .line 545
    sget-object v2, Lcom/kik/android/c/f;->b:Ljava/util/HashMap;

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 546
    sget-object v0, Lcom/kik/android/c/f;->b:Ljava/util/HashMap;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_0
.end method

.method private static g(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 560
    if-nez p0, :cond_1

    .line 567
    :cond_0
    :goto_0
    return-object v0

    .line 563
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    .line 564
    sget-object v2, Lcom/kik/android/c/f;->a:Ljava/util/HashMap;

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    move-object v0, v1

    .line 565
    goto :goto_0
.end method

.method private h(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 604
    if-nez p1, :cond_1

    .line 612
    :cond_0
    :goto_0
    return-object v0

    .line 607
    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    .line 608
    iget-object v2, p0, Lcom/kik/android/c/f;->i:Lcom/kik/android/c/l;

    invoke-virtual {v2}, Lcom/kik/android/c/l;->d()Ljava/util/Map;

    move-result-object v2

    .line 609
    invoke-interface {v2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 610
    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/android/c/a;

    invoke-virtual {v0}, Lcom/kik/android/c/a;->c()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method private static i(Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 6

    .prologue
    const/4 v3, 0x0

    .line 837
    if-nez p0, :cond_0

    .line 838
    const/4 v0, 0x0

    .line 842
    :goto_0
    return-object v0

    .line 840
    :cond_0
    sget-object v0, Lcom/kik/cache/z;->e:Lcom/android/volley/r$b;

    sget-object v1, Lcom/kik/cache/z;->d:Lcom/android/volley/r$a;

    invoke-static {p0, v0, v1}, Lcom/kik/cache/aw;->a(Ljava/lang/String;Lcom/android/volley/r$b;Lcom/android/volley/r$a;)Lcom/kik/cache/aw;

    move-result-object v1

    .line 841
    sget-object v0, Lcom/kik/android/c/f;->h:Lcom/kik/cache/ad;

    sget-object v2, Lcom/kik/cache/ad;->a:Lcom/kik/cache/ad$d;

    const/4 v5, 0x1

    move v4, v3

    invoke-virtual/range {v0 .. v5}, Lcom/kik/cache/ad;->a(Lcom/kik/cache/z;Lcom/kik/cache/ad$d;IIZ)Lcom/kik/cache/ad$c;

    move-result-object v0

    .line 842
    invoke-virtual {v0}, Lcom/kik/cache/ad$c;->b()Landroid/graphics/Bitmap;

    move-result-object v0

    goto :goto_0
.end method


# virtual methods
.method public final a(Landroid/content/Context;Landroid/text/Spannable;)Lcom/kik/android/c/f$c;
    .locals 17

    .prologue
    .line 763
    if-eqz p2, :cond_0

    if-nez p1, :cond_1

    .line 764
    :cond_0
    new-instance v1, Lcom/kik/android/c/f$c;

    invoke-direct {v1}, Lcom/kik/android/c/f$c;-><init>()V

    .line 766
    :goto_0
    return-object v1

    :cond_1
    new-instance v9, Lcom/kik/android/c/f$c;

    invoke-direct {v9}, Lcom/kik/android/c/f$c;-><init>()V

    if-eqz p1, :cond_2

    if-nez p2, :cond_3

    :cond_2
    move-object v1, v9

    goto :goto_0

    :cond_3
    new-instance v11, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-interface/range {p2 .. p2}, Landroid/text/Spannable;->length()I

    move-result v2

    const-class v3, Lcom/kik/android/c/b;

    move-object/from16 v0, p2

    invoke-interface {v0, v1, v2, v3}, Landroid/text/Spannable;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v11, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v8

    const/4 v2, 0x0

    invoke-static {}, Lkik/android/util/cj;->a()Lkik/android/util/cj;

    move-result-object v1

    move-object/from16 v0, p2

    invoke-virtual {v1, v0}, Lkik/android/util/cj;->b(Ljava/lang/CharSequence;)[Lkik/android/util/bk$a;

    move-result-object v12

    array-length v13, v12

    const/4 v1, 0x0

    move v10, v1

    :goto_1
    if-ge v10, v13, :cond_8

    aget-object v14, v12, v10

    if-eqz v14, :cond_b

    invoke-virtual {v14}, Lkik/android/util/bk$a;->a()I

    move-result v1

    invoke-virtual {v14}, Lkik/android/util/bk$a;->b()I

    move-result v3

    const-class v4, Lcom/kik/android/c/b;

    move-object/from16 v0, p2

    invoke-interface {v0, v1, v3, v4}, Landroid/text/Spannable;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lcom/kik/android/c/b;

    if-eqz v1, :cond_4

    array-length v3, v1

    if-lez v3, :cond_4

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v11, v1}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z

    move v1, v2

    move v2, v8

    :goto_2
    add-int/lit8 v3, v10, 0x1

    move v10, v3

    move v8, v2

    move v2, v1

    goto :goto_1

    :cond_4
    invoke-virtual {v14}, Lkik/android/util/bk$a;->c()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/kik/android/c/f;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_5

    move-object/from16 v0, p0

    invoke-direct {v0, v3}, Lcom/kik/android/c/f;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_5

    :goto_3
    invoke-static {v4}, Lcom/kik/android/c/f;->i(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v1

    const/4 v7, 0x0

    if-eqz v1, :cond_6

    new-instance v2, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-direct {v2, v5, v1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    :goto_4
    const/4 v1, 0x0

    const/4 v5, 0x0

    const/16 v6, 0x15

    invoke-static {v6}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v6

    const/16 v15, 0x15

    invoke-static {v15}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v15

    invoke-virtual {v2, v1, v5, v6, v15}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    new-instance v1, Lcom/kik/android/c/b;

    const/4 v5, 0x0

    invoke-virtual {v14}, Lkik/android/util/bk$a;->b()I

    move-result v6

    invoke-virtual {v14}, Lkik/android/util/bk$a;->a()I

    move-result v15

    sub-int/2addr v6, v15

    invoke-direct/range {v1 .. v7}, Lcom/kik/android/c/b;-><init>(Landroid/graphics/drawable/Drawable;Ljava/lang/String;Ljava/lang/String;Lkik/android/e/f;IZ)V

    invoke-virtual {v14}, Lkik/android/util/bk$a;->a()I

    move-result v2

    invoke-virtual {v14}, Lkik/android/util/bk$a;->b()I

    move-result v3

    const/16 v4, 0x21

    move-object/from16 v0, p2

    invoke-interface {v0, v1, v2, v3, v4}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    const/4 v2, 0x1

    iget-object v3, v9, Lcom/kik/android/c/f$c;->a:Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v8, 0x1

    const/16 v3, 0x32

    if-ge v1, v3, :cond_8

    move/from16 v16, v2

    move v2, v1

    move/from16 v1, v16

    goto :goto_2

    :cond_5
    const/4 v4, 0x0

    goto :goto_3

    :cond_6
    if-nez v4, :cond_7

    invoke-static {v3}, Lcom/kik/android/c/f;->e(Ljava/lang/String;)I

    move-result v1

    :goto_5
    if-lez v1, :cond_b

    const/4 v7, 0x1

    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    goto :goto_4

    :cond_7
    invoke-static {v3}, Lcom/kik/android/c/f;->f(Ljava/lang/String;)I

    move-result v1

    goto :goto_5

    :cond_8
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_9
    :goto_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/kik/android/c/b;

    if-eqz v1, :cond_9

    invoke-virtual {v1}, Lcom/kik/android/c/b;->c()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/kik/android/c/f;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_9

    move-object/from16 v0, p2

    invoke-interface {v0, v1}, Landroid/text/Spannable;->removeSpan(Ljava/lang/Object;)V

    const/4 v2, 0x1

    iget v1, v9, Lcom/kik/android/c/f$c;->b:I

    add-int/lit8 v1, v1, 0x1

    iput v1, v9, Lcom/kik/android/c/f$c;->b:I

    goto :goto_6

    :cond_a
    iput-boolean v2, v9, Lcom/kik/android/c/f$c;->c:Z

    move-object v1, v9

    goto/16 :goto_0

    :cond_b
    move v1, v2

    move v2, v8

    goto/16 :goto_2
.end method

.method public final a(Ljava/lang/String;)Ljava/util/List;
    .locals 4

    .prologue
    .line 334
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 335
    if-nez p1, :cond_0

    move-object v0, v1

    .line 356
    :goto_0
    return-object v0

    .line 338
    :cond_0
    iget-object v0, p0, Lcom/kik/android/c/f;->i:Lcom/kik/android/c/l;

    invoke-virtual {v0}, Lcom/kik/android/c/l;->a()Ljava/util/List;

    move-result-object v0

    .line 339
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/android/c/e;

    .line 340
    if-eqz v0, :cond_1

    .line 341
    invoke-virtual {v0}, Lcom/kik/android/c/e;->g()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 344
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 347
    :cond_2
    sget-object v0, Lcom/kik/android/c/f;->j:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_3
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/android/c/c;

    .line 348
    if-eqz v0, :cond_3

    .line 349
    invoke-virtual {v0}, Lcom/kik/android/c/c;->g()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 352
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 355
    :cond_4
    new-instance v0, Lcom/kik/android/c/e$a;

    invoke-direct {v0}, Lcom/kik/android/c/e$a;-><init>()V

    invoke-static {v1, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    move-object v0, v1

    .line 356
    goto :goto_0
.end method

.method public final a(Lcom/kik/android/c/e;)V
    .locals 3

    .prologue
    .line 946
    if-nez p1, :cond_1

    .line 962
    :cond_0
    :goto_0
    return-void

    .line 949
    :cond_1
    instance-of v0, p1, Lcom/kik/android/c/c;

    if-eqz v0, :cond_2

    .line 951
    iget-object v0, p0, Lcom/kik/android/c/f;->i:Lcom/kik/android/c/l;

    invoke-virtual {v0}, Lcom/kik/android/c/l;->d()Ljava/util/Map;

    move-result-object v0

    .line 952
    invoke-virtual {p1}, Lcom/kik/android/c/e;->g()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/android/c/a;

    .line 953
    if-eqz v0, :cond_0

    .line 955
    iget-object v1, p0, Lcom/kik/android/c/f;->i:Lcom/kik/android/c/l;

    invoke-virtual {v1, v0}, Lcom/kik/android/c/l;->b(Lcom/kik/android/c/a;)V

    goto :goto_0

    .line 959
    :cond_2
    new-instance v0, Lcom/kik/android/c/a;

    invoke-virtual {p1}, Lcom/kik/android/c/e;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/kik/android/c/e;->e()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/kik/android/c/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 960
    iget-object v1, p0, Lcom/kik/android/c/f;->i:Lcom/kik/android/c/l;

    invoke-virtual {v1, v0}, Lcom/kik/android/c/l;->a(Lcom/kik/android/c/a;)V

    goto :goto_0
.end method

.method public final a(Lorg/json/JSONObject;)V
    .locals 2

    .prologue
    .line 872
    invoke-static {p1}, Lcom/kik/android/c/f;->c(Lorg/json/JSONObject;)Ljava/util/List;

    move-result-object v0

    .line 873
    iget-object v1, p0, Lcom/kik/android/c/f;->i:Lcom/kik/android/c/l;

    invoke-virtual {v1, v0}, Lcom/kik/android/c/l;->a(Ljava/util/List;)V

    .line 874
    invoke-static {p1}, Lcom/kik/android/c/f;->d(Lorg/json/JSONObject;)V

    .line 875
    invoke-static {v0}, Lcom/kik/android/c/f;->b(Ljava/util/List;)V

    .line 876
    return-void
.end method

.method public final a()Z
    .locals 1

    .prologue
    .line 287
    iget-object v0, p0, Lcom/kik/android/c/f;->i:Lcom/kik/android/c/l;

    invoke-virtual {v0}, Lcom/kik/android/c/l;->i()Z

    move-result v0

    return v0
.end method

.method public final b(Ljava/lang/String;)Lcom/kik/android/c/e;
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 584
    if-nez p1, :cond_1

    move-object v0, v1

    .line 599
    :cond_0
    :goto_0
    return-object v0

    .line 587
    :cond_1
    invoke-direct {p0, p1}, Lcom/kik/android/c/f;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 588
    if-eqz v0, :cond_2

    .line 589
    iget-object v2, p0, Lcom/kik/android/c/f;->i:Lcom/kik/android/c/l;

    invoke-virtual {v2, v0}, Lcom/kik/android/c/l;->a(Ljava/lang/String;)Lcom/kik/android/c/e;

    move-result-object v0

    .line 590
    if-nez v0, :cond_0

    .line 594
    :cond_2
    sget-object v0, Lcom/kik/android/c/f;->j:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/android/c/c;

    .line 595
    invoke-virtual {v0}, Lcom/kik/android/c/c;->g()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_0

    :cond_4
    move-object v0, v1

    .line 599
    goto :goto_0
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 292
    iget-object v0, p0, Lcom/kik/android/c/f;->i:Lcom/kik/android/c/l;

    invoke-virtual {v0}, Lcom/kik/android/c/l;->j()V

    .line 293
    return-void
.end method

.method public final b(Lcom/kik/android/c/e;)V
    .locals 1

    .prologue
    .line 1061
    iget-object v0, p0, Lcom/kik/android/c/f;->i:Lcom/kik/android/c/l;

    invoke-virtual {v0, p1}, Lcom/kik/android/c/l;->b(Lcom/kik/android/c/e;)V

    .line 1062
    return-void
.end method

.method public final c(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 617
    iget-object v0, p0, Lcom/kik/android/c/f;->i:Lcom/kik/android/c/l;

    invoke-virtual {v0, p1}, Lcom/kik/android/c/l;->b(Ljava/lang/String;)V

    .line 618
    return-void
.end method

.method public final d(Ljava/lang/String;)Lcom/kik/android/c/e;
    .locals 1

    .prologue
    .line 867
    iget-object v0, p0, Lcom/kik/android/c/f;->i:Lcom/kik/android/c/l;

    invoke-virtual {v0, p1}, Lcom/kik/android/c/l;->a(Ljava/lang/String;)Lcom/kik/android/c/e;

    move-result-object v0

    return-object v0
.end method

.method public final d()Ljava/util/List;
    .locals 12

    .prologue
    .line 302
    new-instance v9, Ljava/util/LinkedHashMap;

    invoke-direct {v9}, Ljava/util/LinkedHashMap;-><init>()V

    .line 304
    sget-object v0, Lcom/kik/android/c/f;->j:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :cond_0
    :goto_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/kik/android/c/c;

    .line 305
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/kik/android/c/c;->g()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 306
    invoke-virtual {v1}, Lcom/kik/android/c/c;->g()Ljava/lang/String;

    move-result-object v11

    new-instance v0, Lcom/kik/android/c/f$b;

    iget-object v2, p0, Lcom/kik/android/c/f;->i:Lcom/kik/android/c/l;

    invoke-virtual {v2}, Lcom/kik/android/c/l;->e()J

    move-result-wide v2

    iget-object v4, p0, Lcom/kik/android/c/f;->i:Lcom/kik/android/c/l;

    invoke-virtual {v4, v1}, Lcom/kik/android/c/l;->a(Lcom/kik/android/c/e;)J

    move-result-wide v4

    invoke-virtual {v1}, Lcom/kik/android/c/c;->i()J

    move-result-wide v6

    const/4 v8, 0x0

    invoke-direct/range {v0 .. v8}, Lcom/kik/android/c/f$b;-><init>(Lcom/kik/android/c/e;JJJB)V

    invoke-virtual {v9, v11, v0}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 310
    :cond_1
    iget-object v0, p0, Lcom/kik/android/c/f;->i:Lcom/kik/android/c/l;

    invoke-virtual {v0}, Lcom/kik/android/c/l;->a()Ljava/util/List;

    move-result-object v0

    .line 311
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/android/c/e;

    .line 312
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/kik/android/c/e;->g()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 313
    invoke-virtual {v0}, Lcom/kik/android/c/e;->g()Ljava/lang/String;

    move-result-object v1

    .line 316
    invoke-virtual {v9, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/kik/android/c/f$b;

    .line 317
    if-eqz v1, :cond_2

    .line 318
    invoke-virtual {v0}, Lcom/kik/android/c/e;->h()Z

    move-result v3

    if-eqz v3, :cond_3

    .line 321
    invoke-static {v1, v0}, Lcom/kik/android/c/f$b;->a(Lcom/kik/android/c/f$b;Lcom/kik/android/c/e;)V

    .line 324
    :cond_3
    invoke-virtual {v0}, Lcom/kik/android/c/e;->i()J

    move-result-wide v4

    invoke-virtual {v1}, Lcom/kik/android/c/f$b;->a()J

    move-result-wide v6

    cmp-long v3, v4, v6

    if-lez v3, :cond_2

    .line 325
    invoke-virtual {v0}, Lcom/kik/android/c/e;->i()J

    move-result-wide v4

    invoke-static {v1, v4, v5}, Lcom/kik/android/c/f$b;->a(Lcom/kik/android/c/f$b;J)V

    goto :goto_1

    .line 329
    :cond_4
    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {v9}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public final f()Ljava/util/List;
    .locals 1

    .prologue
    .line 862
    iget-object v0, p0, Lcom/kik/android/c/f;->i:Lcom/kik/android/c/l;

    invoke-virtual {v0}, Lcom/kik/android/c/l;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final g()V
    .locals 3

    .prologue
    .line 936
    iget-object v0, p0, Lcom/kik/android/c/f;->o:Lcom/kik/g/f;

    invoke-virtual {v0}, Lcom/kik/g/f;->a()V

    .line 937
    sget-object v0, Lcom/kik/android/c/f;->p:Ljava/io/File;

    if-eqz v0, :cond_0

    .line 938
    iget-object v0, p0, Lcom/kik/android/c/f;->i:Lcom/kik/android/c/l;

    invoke-virtual {v0}, Lcom/kik/android/c/l;->b()V

    .line 939
    iget-object v0, p0, Lcom/kik/android/c/f;->i:Lcom/kik/android/c/l;

    invoke-virtual {v0}, Lcom/kik/android/c/l;->c()V

    .line 940
    sget-object v0, Lcom/kik/android/c/f;->p:Ljava/io/File;

    const/4 v1, 0x1

    sget-object v2, Lcom/kik/android/c/f;->n:Lorg/c/b;

    invoke-static {v0, v1, v2}, Lkik/a/h/c;->a(Ljava/io/File;ZLorg/c/b;)Z

    .line 942
    :cond_0
    return-void
.end method

.method public final h()J
    .locals 2

    .prologue
    .line 1051
    iget-object v0, p0, Lcom/kik/android/c/f;->i:Lcom/kik/android/c/l;

    invoke-virtual {v0}, Lcom/kik/android/c/l;->e()J

    move-result-wide v0

    return-wide v0
.end method

.method public final i()V
    .locals 1

    .prologue
    .line 1056
    iget-object v0, p0, Lcom/kik/android/c/f;->i:Lcom/kik/android/c/l;

    invoke-virtual {v0}, Lcom/kik/android/c/l;->f()V

    .line 1057
    return-void
.end method
