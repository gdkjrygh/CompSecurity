.class public Lcom/googlecode/mp4parser/util/Iso639;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static threeToTwo:Ljava/util/Map;

.field static twoToThree:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 12
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/googlecode/mp4parser/util/Iso639;->twoToThree:Ljava/util/Map;

    .line 13
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/googlecode/mp4parser/util/Iso639;->threeToTwo:Ljava/util/Map;

    .line 15
    const-string v0, "ab"

    const-string v1, "abk"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    const-string v0, "aa"

    const-string v1, "aar"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    const-string v0, "af"

    const-string v1, "afr"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 18
    const-string v0, "ak"

    const-string v1, "aka"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    const-string v0, "sq"

    const-string v1, "sqi"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    const-string v0, "am"

    const-string v1, "amh"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    const-string v0, "ar"

    const-string v1, "ara"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    const-string v0, "an"

    const-string v1, "arg"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    const-string v0, "hy"

    const-string v1, "hye"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    const-string v0, "as"

    const-string v1, "asm"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    const-string v0, "av"

    const-string v1, "ava"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    const-string v0, "ae"

    const-string v1, "ave"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    const-string v0, "ay"

    const-string v1, "aym"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    const-string v0, "az"

    const-string v1, "aze"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    const-string v0, "bm"

    const-string v1, "bam"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    const-string v0, "ba"

    const-string v1, "bak"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    const-string v0, "eu"

    const-string v1, "eus"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    const-string v0, "be"

    const-string v1, "bel"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    const-string v0, "bn"

    const-string v1, "ben"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    const-string v0, "bh"

    const-string v1, "bih"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    const-string v0, "bi"

    const-string v1, "bis"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    const-string v0, "bs"

    const-string v1, "bos"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    const-string v0, "br"

    const-string v1, "bre"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    const-string v0, "bg"

    const-string v1, "bul"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    const-string v0, "my"

    const-string v1, "mya"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    const-string v0, "ca"

    const-string v1, "cat"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    const-string v0, "ch"

    const-string v1, "cha"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 42
    const-string v0, "ce"

    const-string v1, "che"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    const-string v0, "ny"

    const-string v1, "nya"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    const-string v0, "zh"

    const-string v1, "zho"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    const-string v0, "cv"

    const-string v1, "chv"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    const-string v0, "kw"

    const-string v1, "cor"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    const-string v0, "co"

    const-string v1, "cos"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    const-string v0, "cr"

    const-string v1, "cre"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    const-string v0, "hr"

    const-string v1, "hrv"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    const-string v0, "cs"

    const-string v1, "ces"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    const-string v0, "da"

    const-string v1, "dan"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    const-string v0, "dv"

    const-string v1, "div"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    const-string v0, "nl"

    const-string v1, "nld"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    const-string v0, "dz"

    const-string v1, "dzo"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    const-string v0, "en"

    const-string v1, "eng"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    const-string v0, "eo"

    const-string v1, "epo"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    const-string v0, "et"

    const-string v1, "est"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    const-string v0, "ee"

    const-string v1, "ewe"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    const-string v0, "fo"

    const-string v1, "fao"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    const-string v0, "fj"

    const-string v1, "fij"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 61
    const-string v0, "fi"

    const-string v1, "fin"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 62
    const-string v0, "fr"

    const-string v1, "fra"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 63
    const-string v0, "ff"

    const-string v1, "ful"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    const-string v0, "gl"

    const-string v1, "glg"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 65
    const-string v0, "ka"

    const-string v1, "kat"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 66
    const-string v0, "de"

    const-string v1, "deu"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    const-string v0, "el"

    const-string v1, "ell"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 68
    const-string v0, "gn"

    const-string v1, "grn"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 69
    const-string v0, "gu"

    const-string v1, "guj"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 70
    const-string v0, "ht"

    const-string v1, "hat"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 71
    const-string v0, "ha"

    const-string v1, "hau"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 72
    const-string v0, "he"

    const-string v1, "heb"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    const-string v0, "hz"

    const-string v1, "her"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 74
    const-string v0, "hi"

    const-string v1, "hin"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 75
    const-string v0, "ho"

    const-string v1, "hmo"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    const-string v0, "hu"

    const-string v1, "hun"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 77
    const-string v0, "ia"

    const-string v1, "ina"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 78
    const-string v0, "id"

    const-string v1, "ind"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    const-string v0, "ie"

    const-string v1, "ile"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 80
    const-string v0, "ga"

    const-string v1, "gle"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 81
    const-string v0, "ig"

    const-string v1, "ibo"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    const-string v0, "ik"

    const-string v1, "ipk"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 83
    const-string v0, "io"

    const-string v1, "ido"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 84
    const-string v0, "is"

    const-string v1, "isl"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 85
    const-string v0, "it"

    const-string v1, "ita"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 86
    const-string v0, "iu"

    const-string v1, "iku"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 87
    const-string v0, "ja"

    const-string v1, "jpn"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 88
    const-string v0, "jv"

    const-string v1, "jav"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 89
    const-string v0, "kl"

    const-string v1, "kal"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    const-string v0, "kn"

    const-string v1, "kan"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 91
    const-string v0, "kr"

    const-string v1, "kau"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 92
    const-string v0, "ks"

    const-string v1, "kas"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    const-string v0, "kk"

    const-string v1, "kaz"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 94
    const-string v0, "km"

    const-string v1, "khm"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 95
    const-string v0, "ki"

    const-string v1, "kik"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 96
    const-string v0, "rw"

    const-string v1, "kin"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 97
    const-string v0, "ky"

    const-string v1, "kir"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 98
    const-string v0, "kv"

    const-string v1, "kom"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 99
    const-string v0, "kg"

    const-string v1, "kon"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 100
    const-string v0, "ko"

    const-string v1, "kor"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 101
    const-string v0, "ku"

    const-string v1, "kur"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 102
    const-string v0, "kj"

    const-string v1, "kua"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 103
    const-string v0, "la"

    const-string v1, "lat"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 104
    const-string v0, "lb"

    const-string v1, "ltz"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 105
    const-string v0, "lg"

    const-string v1, "lug"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 106
    const-string v0, "li"

    const-string v1, "lim"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 107
    const-string v0, "ln"

    const-string v1, "lin"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 108
    const-string v0, "lo"

    const-string v1, "lao"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 109
    const-string v0, "lt"

    const-string v1, "lit"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 110
    const-string v0, "lu"

    const-string v1, "lub"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 111
    const-string v0, "lv"

    const-string v1, "lav"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 112
    const-string v0, "gv"

    const-string v1, "glv"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 113
    const-string v0, "mk"

    const-string v1, "mkd"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 114
    const-string v0, "mg"

    const-string v1, "mlg"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 115
    const-string v0, "ms"

    const-string v1, "msa"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 116
    const-string v0, "ml"

    const-string v1, "mal"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 117
    const-string v0, "mt"

    const-string v1, "mlt"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 118
    const-string v0, "mi"

    const-string v1, "mri"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 119
    const-string v0, "mr"

    const-string v1, "mar"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 120
    const-string v0, "mh"

    const-string v1, "mah"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 121
    const-string v0, "mn"

    const-string v1, "mon"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 122
    const-string v0, "na"

    const-string v1, "nau"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 123
    const-string v0, "nv"

    const-string v1, "nav"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 124
    const-string v0, "nd"

    const-string v1, "nde"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 125
    const-string v0, "ne"

    const-string v1, "nep"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 126
    const-string v0, "ng"

    const-string v1, "ndo"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 127
    const-string v0, "nb"

    const-string v1, "nob"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 128
    const-string v0, "nn"

    const-string v1, "nno"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 129
    const-string v0, "no"

    const-string v1, "nor"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 130
    const-string v0, "ii"

    const-string v1, "iii"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 131
    const-string v0, "nr"

    const-string v1, "nbl"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 132
    const-string v0, "oc"

    const-string v1, "oci"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 133
    const-string v0, "oj"

    const-string v1, "oji"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 134
    const-string v0, "cu"

    const-string v1, "chu"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 135
    const-string v0, "om"

    const-string v1, "orm"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 136
    const-string v0, "or"

    const-string v1, "ori"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 137
    const-string v0, "os"

    const-string v1, "oss"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 138
    const-string v0, "pa"

    const-string v1, "pan"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 139
    const-string v0, "pi"

    const-string v1, "pli"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 140
    const-string v0, "fa"

    const-string v1, "fas"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 141
    const-string v0, "pl"

    const-string v1, "pol"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 142
    const-string v0, "ps"

    const-string v1, "pus"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 143
    const-string v0, "pt"

    const-string v1, "por"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 144
    const-string v0, "qu"

    const-string v1, "que"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 145
    const-string v0, "rm"

    const-string v1, "roh"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 146
    const-string v0, "rn"

    const-string v1, "run"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 147
    const-string v0, "ro"

    const-string v1, "ron"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 148
    const-string v0, "ru"

    const-string v1, "rus"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 149
    const-string v0, "sa"

    const-string v1, "san"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 150
    const-string v0, "sc"

    const-string v1, "srd"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 151
    const-string v0, "sd"

    const-string v1, "snd"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 152
    const-string v0, "se"

    const-string v1, "sme"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 153
    const-string v0, "sm"

    const-string v1, "smo"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 154
    const-string v0, "sg"

    const-string v1, "sag"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 155
    const-string v0, "sr"

    const-string v1, "srp"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 156
    const-string v0, "gd"

    const-string v1, "gla"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 157
    const-string v0, "sn"

    const-string v1, "sna"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 158
    const-string v0, "si"

    const-string v1, "sin"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 159
    const-string v0, "sk"

    const-string v1, "slk"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 160
    const-string v0, "sl"

    const-string v1, "slv"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 161
    const-string v0, "so"

    const-string v1, "som"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 162
    const-string v0, "st"

    const-string v1, "sot"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 163
    const-string v0, "es"

    const-string v1, "spa"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 164
    const-string v0, "su"

    const-string v1, "sun"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 165
    const-string v0, "sw"

    const-string v1, "swa"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 166
    const-string v0, "ss"

    const-string v1, "ssw"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 167
    const-string v0, "sv"

    const-string v1, "swe"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 168
    const-string v0, "ta"

    const-string v1, "tam"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 169
    const-string v0, "te"

    const-string v1, "tel"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 170
    const-string v0, "tg"

    const-string v1, "tgk"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 171
    const-string v0, "th"

    const-string v1, "tha"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 172
    const-string v0, "ti"

    const-string v1, "tir"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 173
    const-string v0, "bo"

    const-string v1, "bod"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 174
    const-string v0, "tk"

    const-string v1, "tuk"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 175
    const-string v0, "tl"

    const-string v1, "tgl"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 176
    const-string v0, "tn"

    const-string v1, "tsn"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 177
    const-string v0, "to"

    const-string v1, "ton"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 178
    const-string v0, "tr"

    const-string v1, "tur"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 179
    const-string v0, "ts"

    const-string v1, "tso"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 180
    const-string v0, "tt"

    const-string v1, "tat"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 181
    const-string v0, "tw"

    const-string v1, "twi"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 182
    const-string v0, "ty"

    const-string v1, "tah"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 183
    const-string v0, "ug"

    const-string v1, "uig"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 184
    const-string v0, "uk"

    const-string v1, "ukr"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 185
    const-string v0, "ur"

    const-string v1, "urd"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 186
    const-string v0, "uz"

    const-string v1, "uzb"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 187
    const-string v0, "ve"

    const-string v1, "ven"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 188
    const-string v0, "vi"

    const-string v1, "vie"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 189
    const-string v0, "vo"

    const-string v1, "vol"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 190
    const-string v0, "wa"

    const-string v1, "wln"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 191
    const-string v0, "cy"

    const-string v1, "cym"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 192
    const-string v0, "wo"

    const-string v1, "wol"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 193
    const-string v0, "fy"

    const-string v1, "fry"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 194
    const-string v0, "xh"

    const-string v1, "xho"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 195
    const-string v0, "yi"

    const-string v1, "yid"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 196
    const-string v0, "yo"

    const-string v1, "yor"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 197
    const-string v0, "za"

    const-string v1, "zha"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 198
    const-string v0, "zu"

    const-string v1, "zul"

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/Iso639;->doublePut(Ljava/lang/String;Ljava/lang/String;)V

    .line 199
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static convert2to3(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 208
    sget-object v0, Lcom/googlecode/mp4parser/util/Iso639;->twoToThree:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public static convert3to2(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 212
    sget-object v0, Lcom/googlecode/mp4parser/util/Iso639;->threeToTwo:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method private static doublePut(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 203
    sget-object v0, Lcom/googlecode/mp4parser/util/Iso639;->twoToThree:Ljava/util/Map;

    invoke-interface {v0, p0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 204
    sget-object v0, Lcom/googlecode/mp4parser/util/Iso639;->threeToTwo:Ljava/util/Map;

    invoke-interface {v0, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 205
    return-void
.end method
